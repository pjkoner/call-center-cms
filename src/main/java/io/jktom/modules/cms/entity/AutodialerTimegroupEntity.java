package io.jktom.modules.cms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-08 10:03:15
 */
@TableName("autodialer_timegroup")
public class AutodialerTimegroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 时间组ID
	 */
	@TableId
	private String uuid;
	/**
	 * 时间组名称
	 */
	private String name;
	/**
	 * 域名
	 */
	private String domain;

	/**
	 * 设置：时间组ID
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：时间组ID
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：时间组名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：时间组名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：域名
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	/**
	 * 获取：域名
	 */
	public String getDomain() {
		return domain;
	}
}
