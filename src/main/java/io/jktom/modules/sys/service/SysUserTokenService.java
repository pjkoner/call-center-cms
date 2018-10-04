package io.jktom.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.jktom.common.utils.R;
import io.jktom.modules.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 15:22:07
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	R createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
