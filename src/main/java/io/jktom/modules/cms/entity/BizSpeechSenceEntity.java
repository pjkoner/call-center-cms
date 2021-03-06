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
 * @date 2018-10-18 11:08:29
 */
@TableName("biz_speech_sence")
public class BizSpeechSenceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long speechId;
	/**
	 * 
	 */
	private String speechName;
	/**
	 *
	 */

	private String mark;

	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private Long companyId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Long createId;
	/**
	 * 
	 */
	private Date modifyTime;
	/**
	 * 
	 */
	private Long modifyId;
	/**
	 * 
	 */
	private Integer isDelete;

	public Long getSpeechId() {
		return speechId;
	}

	public void setSpeechId(Long speechId) {
		this.speechId = speechId;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * 设置：
	 */
	public void setSpeechName(String speechName) {
		this.speechName = speechName;
	}
	/**
	 * 获取：
	 */
	public String getSpeechName() {
		return speechName;
	}
	/**
	 * 设置：
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	/**
	 * 获取：
	 */
	public Long getCompanyId() {
		return companyId;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setCreateId(Long createId) {
		this.createId = createId;
	}
	/**
	 * 获取：
	 */
	public Long getCreateId() {
		return createId;
	}
	/**
	 * 设置：
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：
	 */
	public void setModifyId(Long modifyId) {
		this.modifyId = modifyId;
	}
	/**
	 * 获取：
	 */
	public Long getModifyId() {
		return modifyId;
	}
	/**
	 * 设置：
	 */
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
}
