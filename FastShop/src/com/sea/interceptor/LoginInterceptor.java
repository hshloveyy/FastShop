package com.sea.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	Logger logger = Logger.getLogger(LoginInterceptor.class);
	
	private static final int VIEW_LOGIN = 0;
	
	/**
	 * 不需要session的接口
	 */
	List<String> noSessionList = null;
	
	private String action;
	private int type;
	
	/**
	 * 是否需要session校验
	 */
	private boolean needSession = false;
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		logger.debug("##################### afterCompletion ###############################");
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		logger.debug("##################### postHandle ###############################");
		if(needSession){
			if(request.getSession().getAttribute("user") == null){
				switch (type) {
				case VIEW_LOGIN:
					arg3.setViewName("login");
					break;
	
				default:
					break;
				}
			}
		}
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		logger.debug("##################### preHandle ###############################");
		action = request.getServletPath();
		action = action.substring(1, action.indexOf(".htm"));
		needSession = !noSessionList.contains(action);
		if(needSession){
			type = VIEW_LOGIN;
		}
		return true;
	}

	public void setNoSessionList(List<String> noSessionList) {
		this.noSessionList = noSessionList;
	}

	
}
