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
 * @date 2018-10-16 17:30:19
 */
@TableName("biz_speech_technique")
public class BizSpeechTechniqueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer speechId;
	/**
	 * 
	 */
	private String speechName;
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
	private Integer createId;
	/**
	 * 
	 */
	private Date modifyTime;
	/**
	 * 
	 */
	private Integer modifyId;
	/**
	 * 
	 */
	private Integer isDelete;

	/**
	 * 设置：
	 */
	public void setSpeechId(Integer speechId) {
		this.speechId = speechId;
	}
	/**
	 * 获取：
	 */
	public Integer getSpeechId() {
		return speechId;
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


	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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
	public void setCreateId(Integer createId) {
		this.createId = createId;
	}
	/**
	 * 获取：
	 */
	public Integer getCreateId() {
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
	public void setModifyId(Integer modifyId) {
		this.modifyId = modifyId;
	}
	/**
	 * 获取：
	 */
	public Integer getModifyId() {
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
