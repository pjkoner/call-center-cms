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
@TableName("autodialer_log")
public class AutodialerLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志ID
	 */
	@TableId
	private String uuid;
	/**
	 * 日志时间
	 */
	private Date createDatetime;
	/**
	 * 日志关联的表名
	 */
	private String tableName;
	/**
	 * 日志关联的表的记录ID
	 */
	private String relatedId;
	/**
	 * 域名
	 */
	private String domain;
	/**
	 * 日志内容
	 */
	private String content;

	/**
	 * 设置：日志ID
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：日志ID
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：日志时间
	 */
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	/**
	 * 获取：日志时间
	 */
	public Date getCreateDatetime() {
		return createDatetime;
	}
	/**
	 * 设置：日志关联的表名
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	/**
	 * 获取：日志关联的表名
	 */
	public String getTableName() {
		return tableName;
	}
	/**
	 * 设置：日志关联的表的记录ID
	 */
	public void setRelatedId(String relatedId) {
		this.relatedId = relatedId;
	}
	/**
	 * 获取：日志关联的表的记录ID
	 */
	public String getRelatedId() {
		return relatedId;
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
	/**
	 * 设置：日志内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：日志内容
	 */
	public String getContent() {
		return content;
	}
}
