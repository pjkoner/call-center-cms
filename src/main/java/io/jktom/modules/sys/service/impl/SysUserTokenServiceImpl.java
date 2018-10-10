package io.jktom.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.R;

import io.jktom.modules.sys.dao.SysUserTokenDao;
import io.jktom.modules.sys.entity.SysUserTokenEntity;
import io.jktom.modules.sys.oauth2.TokenGenerator;
import io.jktom.modules.sys.service.SysUserTokenService;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service("sysUserTokenService")
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements SysUserTokenService {
	//12小时后过期
	private final static int EXPIRE = 604800;


	@Override
	public R createToken(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue(userId);

		R r = R.ok().put("token", token).put("expire", EXPIRE);

		return r;
	}

	@Override
	public void logout(long userId) {
		//生成一个token
		String token = TokenGenerator.generateValue(userId);

		//修改token
		SysUserTokenEntity tokenEntity = new SysUserTokenEntity();
		tokenEntity.setUserId(userId);
		tokenEntity.setToken(token);
		this.updateById(tokenEntity);
	}
}
