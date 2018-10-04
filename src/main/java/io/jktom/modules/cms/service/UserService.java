package io.jktom.modules.cms.service;


import com.baomidou.mybatisplus.service.IService;
import io.jktom.modules.cms.entity.UserEntity;
import io.jktom.modules.cms.form.LoginForm;

/**
 * 用户
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 15:22:06
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
