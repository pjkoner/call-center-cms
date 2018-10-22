package io.jktom.modules.cms.bo;

import java.util.Date;


/**
 * 查询BO
 * 
 * @ClassName: BizSpeechInfoBO
 * @Description: by CodeGenerate
 * @author 
 * 
 */
public class QueryBizSpeechInfoBO  {

	/** 
	 *  ( 主键 ) 
	 */
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
	private Date createTime;
	/** 
	 *   
	 */
	private Date modifyTime;
	/** 
	 *   
	 */
	private Integer isDelete;
	
	public Long getSpeechNodeId() {
		return speechNodeId;
	}
	
	public void setSpeechNodeId(Long speechNodeId) {
		this.speechNodeId = speechNodeId;
	}

	public Long getSpeechId() {
		return speechId;
	}
	
	public void setSpeechId(Long speechId) {
		this.speechId = speechId;
	}

	public String getNodeName() {
		return nodeName;
	}
	
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getSortIndex() {
		return sortIndex;
	}
	
	public void setSortIndex(Integer sortIndex) {
		this.sortIndex = sortIndex;
	}

	public Integer getSerialNum() {
		return serialNum;
	}
	
	public void setSerialNum(Integer serialNum) {
		this.serialNum = serialNum;
	}

	public String getSpeechInfo() {
		return speechInfo;
	}
	
	public void setSpeechInfo(String speechInfo) {
		this.speechInfo = speechInfo;
	}

	public Long getCreateId() {
		return createId;
	}
	
	public void setCreateId(Long createId) {
		this.createId = createId;
	}

	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}
	
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Integer getIsDelete() {
		return isDelete;
	}
	
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	/* -------------------- 非DB字段 -------------------- */
}