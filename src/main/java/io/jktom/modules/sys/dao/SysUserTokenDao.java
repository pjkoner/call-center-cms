package io.jktom.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.jktom.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 15:22:07
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
