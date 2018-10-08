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
@TableName("autodialer_number_1")
public class AutodialerNumber1Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增ID
	 */
	@TableId
	private Integer id;
	/**
	 * 电话号码
	 */
	private String number;
	/**
	 * 号码状态
	 */
	private Integer state;
	/**
	 * 号码状态描述
	 */
	private String description;
	/**
	 * 回收次数
	 */
	private Integer recycle;
	/**
	 * 通话唯一ID
	 */
	private String callid;
	/**
	 * 主叫号码
	 */
	private String calleridnumber;
	/**
	 * 呼叫时间
	 */
	private Date calldate;
	/**
	 * 计费时间
	 */
	private Integer bill;
	/**
	 * 总时间
	 */
	private Integer duration;
	/**
	 * 挂掉原因
	 */
	private String hangupcause;
	/**
	 * 
	 */
	private Date hangupdate;
	/**
	 * 
	 */
	private Date answerdate;
	/**
	 * 录音文件路径
	 */
	private String recordfile;
	/**
	 * 号码状态，空号关机等
	 */
	private String status;
	/**
	 * 桥接通话ID
	 */
	private String bridgeCallid;
	/**
	 * 桥接号码
	 */
	private String bridgeNumber;
	/**
	 * 桥接开始时间
	 */
	private Date bridgeCalldate;
	/**
	 * 桥接应答时间
	 */
	private Date bridgeAnswerdate;

	/**
	 * 设置：自增ID
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：自增ID
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：电话号码
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * 获取：电话号码
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * 设置：号码状态
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * 获取：号码状态
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * 设置：号码状态描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：号码状态描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：回收次数
	 */
	public void setRecycle(Integer recycle) {
		this.recycle = recycle;
	}
	/**
	 * 获取：回收次数
	 */
	public Integer getRecycle() {
		return recycle;
	}
	/**
	 * 设置：通话唯一ID
	 */
	public void setCallid(String callid) {
		this.callid = callid;
	}
	/**
	 * 获取：通话唯一ID
	 */
	public String getCallid() {
		return callid;
	}
	/**
	 * 设置：主叫号码
	 */
	public void setCalleridnumber(String calleridnumber) {
		this.calleridnumber = calleridnumber;
	}
	/**
	 * 获取：主叫号码
	 */
	public String getCalleridnumber() {
		return calleridnumber;
	}
	/**
	 * 设置：呼叫时间
	 */
	public void setCalldate(Date calldate) {
		this.calldate = calldate;
	}
	/**
	 * 获取：呼叫时间
	 */
	public Date getCalldate() {
		return calldate;
	}
	/**
	 * 设置：计费时间
	 */
	public void setBill(Integer bill) {
		this.bill = bill;
	}
	/**
	 * 获取：计费时间
	 */
	public Integer getBill() {
		return bill;
	}
	/**
	 * 设置：总时间
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	/**
	 * 获取：总时间
	 */
	public Integer getDuration() {
		return duration;
	}
	/**
	 * 设置：挂掉原因
	 */
	public void setHangupcause(String hangupcause) {
		this.hangupcause = hangupcause;
	}
	/**
	 * 获取：挂掉原因
	 */
	public String getHangupcause() {
		return hangupcause;
	}
	/**
	 * 设置：
	 */
	public void setHangupdate(Date hangupdate) {
		this.hangupdate = hangupdate;
	}
	/**
	 * 获取：
	 */
	public Date getHangupdate() {
		return hangupdate;
	}
	/**
	 * 设置：
	 */
	public void setAnswerdate(Date answerdate) {
		this.answerdate = answerdate;
	}
	/**
	 * 获取：
	 */
	public Date getAnswerdate() {
		return answerdate;
	}
	/**
	 * 设置：录音文件路径
	 */
	public void setRecordfile(String recordfile) {
		this.recordfile = recordfile;
	}
	/**
	 * 获取：录音文件路径
	 */
	public String getRecordfile() {
		return recordfile;
	}
	/**
	 * 设置：号码状态，空号关机等
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：号码状态，空号关机等
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：桥接通话ID
	 */
	public void setBridgeCallid(String bridgeCallid) {
		this.bridgeCallid = bridgeCallid;
	}
	/**
	 * 获取：桥接通话ID
	 */
	public String getBridgeCallid() {
		return bridgeCallid;
	}
	/**
	 * 设置：桥接号码
	 */
	public void setBridgeNumber(String bridgeNumber) {
		this.bridgeNumber = bridgeNumber;
	}
	/**
	 * 获取：桥接号码
	 */
	public String getBridgeNumber() {
		return bridgeNumber;
	}
	/**
	 * 设置：桥接开始时间
	 */
	public void setBridgeCalldate(Date bridgeCalldate) {
		this.bridgeCalldate = bridgeCalldate;
	}
	/**
	 * 获取：桥接开始时间
	 */
	public Date getBridgeCalldate() {
		return bridgeCalldate;
	}
	/**
	 * 设置：桥接应答时间
	 */
	public void setBridgeAnswerdate(Date bridgeAnswerdate) {
		this.bridgeAnswerdate = bridgeAnswerdate;
	}
	/**
	 * 获取：桥接应答时间
	 */
	public Date getBridgeAnswerdate() {
		return bridgeAnswerdate;
	}
}
