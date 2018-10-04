package io.jktom.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.jktom.modules.sys.entity.SysUserRoleEntity;
import io.jktom.modules.sys.entity.SysUserRoleEntity;

import java.util.List;



/**
 * 用户与角色对应关系
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018年10月4日 上午9:43:24
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {
	
	void saveOrUpdate(Long userId, List<Long> roleIdList);
	
	/**
	 * 根据用户ID，获取角色ID列表
	 */
	List<Long> queryRoleIdList(Long userId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
