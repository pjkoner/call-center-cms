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
 * @date 2018-10-22 09:31:38
 */
@TableName("biz_speech_info")
public class BizSpeechInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long speechNodeId;
	/**
	 * 
	 */
	private Long speechId;
	/**
	 * 
	 */
	private String nodeName;
	/**
	 * 
	 */
	private Integer sortIndex;
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
	private Long createId;
	/**
	 *
	 */
	private Long modifyId;
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


	public Integer getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}

	public Long getModifyId() {
		return modifyId;
	}

	public void setModifyId(Long modifyId) {
		this.modifyId = modifyId;
	}

	/**
	 * 设置：
	 */
	public void setSpeechNodeId(Long speechNodeId) {
		this.speechNodeId = speechNodeId;
	}
	/**
	 * 获取：
	 */
	public Long getSpeechNodeId() {
		return speechNodeId;
	}
	/**
	 * 设置：
	 */
	public void setSpeechId(Long speechId) {
		this.speechId = speechId;
	}
	/**
	 * 获取：
	 */
	public Long getSpeechId() {
		return speechId;
	}
	/**
	 * 设置：
	 */
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	/**
	 * 获取：
	 */
	public String getNodeName() {
		return nodeName;
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
