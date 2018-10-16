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
@TableName("biz_speech_info")
public class BizSpeechInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer speechInfoId;
	/**
	 * 
	 */
	private Integer speechId;
	/**
	 * 
	 */
	private Integer serialNum;
	/**
	 * 
	 */
	private String speechInfo;
	/**
	 * 
	 */
	private Integer createId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date modifyTime;
	/**
	 * 
	 */
	private Integer isDelete;

	/**
	 * 设置：
	 */
	public void setSpeechInfoId(Integer speechInfoId) {
		this.speechInfoId = speechInfoId;
	}
	/**
	 * 获取：
	 */
	public Integer getSpeechInfoId() {
		return speechInfoId;
	}
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
	public void setSerialNum(Integer serialNum) {
		this.serialNum = serialNum;
	}
	/**
	 * 获取：
	 */
	public Integer getSerialNum() {
		return serialNum;
	}
	/**
	 * 设置：
	 */
	public void setSpeechInfo(String speechInfo) {
		this.speechInfo = speechInfo;
	}
	/**
	 * 获取：
	 */
	public String getSpeechInfo() {
		return speechInfo;
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
