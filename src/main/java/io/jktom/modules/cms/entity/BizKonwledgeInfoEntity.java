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
@TableName("biz_konwledge_info")
public class BizKonwledgeInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long knowledgeId;
	/**
	 * 
	 */
	private Long speechId;
	/**
	 * 
	 */
	private String kdTitle;
	/**
	 * 
	 */
	private String kdKeyWords;
	/**
	 * 
	 */
	private Integer responseNum;
	/**
	 * 
	 */
	private String kdType;
	/**
	 * 
	 */
	private String kdInfo;
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
	private Integer isDelete;

	/**
	 * 设置：
	 */
	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	/**
	 * 获取：
	 */
	public Long getKnowledgeId() {
		return knowledgeId;
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
	public void setKdTitle(String kdTitle) {
		this.kdTitle = kdTitle;
	}
	/**
	 * 获取：
	 */
	public String getKdTitle() {
		return kdTitle;
	}
	/**
	 * 设置：
	 */
	public void setKdKeyWords(String kdKeyWords) {
		this.kdKeyWords = kdKeyWords;
	}
	/**
	 * 获取：
	 */
	public String getKdKeyWords() {
		return kdKeyWords;
	}
	/**
	 * 设置：
	 */
	public void setResponseNum(Integer responseNum) {
		this.responseNum = responseNum;
	}
	/**
	 * 获取：
	 */
	public Integer getResponseNum() {
		return responseNum;
	}
	/**
	 * 设置：
	 */
	public void setKdType(String kdType) {
		this.kdType = kdType;
	}
	/**
	 * 获取：
	 */
	public String getKdType() {
		return kdType;
	}
	/**
	 * 设置：
	 */
	public void setKdInfo(String kdInfo) {
		this.kdInfo = kdInfo;
	}
	/**
	 * 获取：
	 */
	public String getKdInfo() {
		return kdInfo;
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
