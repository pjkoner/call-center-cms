package io.jktom.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.jktom.modules.sys.entity.SysRoleEntity;
import io.jktom.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色管理
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018年10月4日 上午9:33:33
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
