/**
 * 校验两次密码是否一致
 */
function checkPassword(){
	var firstPwd = $('#inputPassword');
	var secondPwd = $('#inputPassword2');
	return firstPwd == secondPwd;
}

/**
 * 请求后台注册接口
 * @returns
 */
function regist(){
	validate();
	console.log('regist');
	if(!checkPassword()){//密码一致
		$.post('registAdmin.do?' + $('#registForm').serialize(),function(data){
			if(data.code == '0000'){
				location.href = 'index.htm';
			}
		},'json');
	}else{//密码不一致
		
	}
}