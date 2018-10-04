package io.jktom.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.jktom.modules.sys.entity.SysRoleMenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色与菜单对应关系
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018年10月4日 上午9:33:46
 */
@Mapper
public interface SysRoleMenuDao extends BaseMapper<SysRoleMenuEntity> {
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);

	/**
	 * 根据角色ID数组，批量删除
	 */
	int deleteBatch(Long[] roleIds);
}
