package io.jktom.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.jktom.modules.sys.entity.SysUserEntity;
import io.jktom.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统用户
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018年10月4日 上午9:34:11
 */
@Mapper
@Component
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	List<String> queryAllPerms(Long userId);
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> queryAllMenuId(Long userId);
	
	/**
	 * 根据用户名，查询系统用户
	 */
	SysUserEntity queryByUserName(String username);

}
