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
@TableName("autodialer_task")
public class AutodialerTaskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 任务ID：（使用GUID）
	 */
	@TableId
	private String uuid;
	/**
	 * 任务名称
	 */
	private String name;
	/**
	 * 号码表版本号：(当前版本为1）
	 */
	private Integer version;
	/**
	 * 任务创建时间
	 */
	private Date createDatetime;
	/**
	 * 任务修改时间：（修改数据后，需要更新这个时间，外呼程序才会从新加载数据。）
	 */
	private Date alterDatetime;
	/**
	 * 是否启动任务：(1:启动，其他值不启动）
	 */
	private Integer start;
	/**
	 * 最大并发呼叫
	 */
	private Integer maximumcall;
	/**
	 * CPS:（每秒最大发起多少个呼叫）
	 */
	private Integer callPerSecond;
	/**
	 * 呼叫限制:（每call_limit_cycle时间最大呼叫号码数）
	 */
	private Integer callLimit;
	/**
	 * 呼叫限制周期(单位分钟)：比如设置 60，就是没小时最大呼叫call_limit个号码
	 */
	private Integer callLimitCycle;
	/**
	 * 呼叫暂停时间单位秒：（每呼叫一个号码暂停一下（用于解决GOIP设备 1个端口时候 呼叫太快很多呼叫失败的问题）
	 */
	private Integer callPauseSecond;
	/**
	 * 号码最大回收次数：（这个是给用户自己使用的，外呼程序不使用这个值。）
	 */
	private Integer recycleLimit;
	/**
	 * 缓存号码数量：（每次从数据库读取多少个号码到待呼队列）
	 */
	private Integer cacheNumberCount;
	/**
	 * 是否随机分配号码：1:随机分配,其他值顺序分配号码.
	 */
	private Integer randomAssignmentNumber;
	/**
	 * 禁止呼叫时间组：（可以设置下班时间自动停止呼叫）
	 */
	private String disableDialTimegroup;
	/**
	 * 应答后转接目的分机：（IVR菜单名字或者FIFO队列名字，机器人“8888”，这个就是机器人接口的calleeid,可以自己设置其他的，dialplan的匹配规则也同同样修改就可以）
	 */
	private String destinationExtension;
	/**
	 * 应答后转接目的拨号方案：（“XML”）
	 */
	private String destinationDialplan;
	/**
	 * 应答后转接目的上下文：（“IVR”或者”FIFO”,机器人”public”或者”default”,具体看dialplan配置）
	 */
	private String destinationContext;
	/**
	 * 外呼比率：（呼叫并发等于空闲数量乘以外呼比率，机器人不要设置。）
	 */
	private Float schedulingPolicyRatio;
	/**
	 * 调度队列：（根据这个队列确定空闲坐席,如果为空，会使用maximumcall作为任务的最大并发。没有队列的，不要设置）
	 */
	private String schedulingQueue;
	/**
	 * 拨号串格式：（%s 匹配电话号码）
	 */
	private String dialFormat;
	/**
	 * 域名：（用于支持多租户）
	 */
	private String domain;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 呼叫通知类型：（0：不通知，1：呼叫失败通知，2：呼叫成功和失败都通知。）
	 */
	private Integer callNotifyType;
	/**
	 * 呼叫通知URL：（如果配置了URL，呼叫结束会根据call_notify_type配置调用这个URL通知）
	 */
	private String callNotifyUrl;
	/**
	 * Originate Variables：（用于自定于呼出参数，需要用{}包围参数。）
	 */
	private String originateVariables;
	/**
	 * 拨号超时：（_开头的字段是可扩展字段，自己添加字段不要用_作为字段名。）
	 */
	private Integer originateTimeout;
	/**
	 * 主叫号码：（设置透传号码，就是送给网关的callerid,可以通过这个参数配合GOIP实现，控制使用那些端口呼出。）
	 */
	private String originationCallerIdNumber;
	/**
	 * 是否忽略早期媒体：（注意：请不要设置,除非你很懂freeswitch.可以自己设置其他值。）
	 */
	private String ignoreEarlyMedia;

	/**
	 * 设置：任务ID：（使用GUID）
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：任务ID：（使用GUID）
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：任务名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：任务名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：号码表版本号：(当前版本为1）
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：号码表版本号：(当前版本为1）
	 */
	public Integer getVersion() {
		return version;
	}
	/**
	 * 设置：任务创建时间
	 */
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	/**
	 * 获取：任务创建时间
	 */
	public Date getCreateDatetime() {
		return createDatetime;
	}
	/**
	 * 设置：任务修改时间：（修改数据后，需要更新这个时间，外呼程序才会从新加载数据。）
	 */
	public void setAlterDatetime(Date alterDatetime) {
		this.alterDatetime = alterDatetime;
	}
	/**
	 * 获取：任务修改时间：（修改数据后，需要更新这个时间，外呼程序才会从新加载数据。）
	 */
	public Date getAlterDatetime() {
		return alterDatetime;
	}
	/**
	 * 设置：是否启动任务：(1:启动，其他值不启动）
	 */
	public void setStart(Integer start) {
		this.start = start;
	}
	/**
	 * 获取：是否启动任务：(1:启动，其他值不启动）
	 */
	public Integer getStart() {
		return start;
	}
	/**
	 * 设置：最大并发呼叫
	 */
	public void setMaximumcall(Integer maximumcall) {
		this.maximumcall = maximumcall;
	}
	/**
	 * 获取：最大并发呼叫
	 */
	public Integer getMaximumcall() {
		return maximumcall;
	}
	/**
	 * 设置：CPS:（每秒最大发起多少个呼叫）
	 */
	public void setCallPerSecond(Integer callPerSecond) {
		this.callPerSecond = callPerSecond;
	}
	/**
	 * 获取：CPS:（每秒最大发起多少个呼叫）
	 */
	public Integer getCallPerSecond() {
		return callPerSecond;
	}
	/**
	 * 设置：呼叫限制:（每call_limit_cycle时间最大呼叫号码数）
	 */
	public void setCallLimit(Integer callLimit) {
		this.callLimit = callLimit;
	}
	/**
	 * 获取：呼叫限制:（每call_limit_cycle时间最大呼叫号码数）
	 */
	public Integer getCallLimit() {
		return callLimit;
	}
	/**
	 * 设置：呼叫限制周期(单位分钟)：比如设置 60，就是没小时最大呼叫call_limit个号码
	 */
	public void setCallLimitCycle(Integer callLimitCycle) {
		this.callLimitCycle = callLimitCycle;
	}
	/**
	 * 获取：呼叫限制周期(单位分钟)：比如设置 60，就是没小时最大呼叫call_limit个号码
	 */
	public Integer getCallLimitCycle() {
		return callLimitCycle;
	}
	/**
	 * 设置：呼叫暂停时间单位秒：（每呼叫一个号码暂停一下（用于解决GOIP设备 1个端口时候 呼叫太快很多呼叫失败的问题）
	 */
	public void setCallPauseSecond(Integer callPauseSecond) {
		this.callPauseSecond = callPauseSecond;
	}
	/**
	 * 获取：呼叫暂停时间单位秒：（每呼叫一个号码暂停一下（用于解决GOIP设备 1个端口时候 呼叫太快很多呼叫失败的问题）
	 */
	public Integer getCallPauseSecond() {
		return callPauseSecond;
	}
	/**
	 * 设置：号码最大回收次数：（这个是给用户自己使用的，外呼程序不使用这个值。）
	 */
	public void setRecycleLimit(Integer recycleLimit) {
		this.recycleLimit = recycleLimit;
	}
	/**
	 * 获取：号码最大回收次数：（这个是给用户自己使用的，外呼程序不使用这个值。）
	 */
	public Integer getRecycleLimit() {
		return recycleLimit;
	}
	/**
	 * 设置：缓存号码数量：（每次从数据库读取多少个号码到待呼队列）
	 */
	public void setCacheNumberCount(Integer cacheNumberCount) {
		this.cacheNumberCount = cacheNumberCount;
	}
	/**
	 * 获取：缓存号码数量：（每次从数据库读取多少个号码到待呼队列）
	 */
	public Integer getCacheNumberCount() {
		return cacheNumberCount;
	}
	/**
	 * 设置：是否随机分配号码：1:随机分配,其他值顺序分配号码.
	 */
	public void setRandomAssignmentNumber(Integer randomAssignmentNumber) {
		this.randomAssignmentNumber = randomAssignmentNumber;
	}
	/**
	 * 获取：是否随机分配号码：1:随机分配,其他值顺序分配号码.
	 */
	public Integer getRandomAssignmentNumber() {
		return randomAssignmentNumber;
	}
	/**
	 * 设置：禁止呼叫时间组：（可以设置下班时间自动停止呼叫）
	 */
	public void setDisableDialTimegroup(String disableDialTimegroup) {
		this.disableDialTimegroup = disableDialTimegroup;
	}
	/**
	 * 获取：禁止呼叫时间组：（可以设置下班时间自动停止呼叫）
	 */
	public String getDisableDialTimegroup() {
		return disableDialTimegroup;
	}
	/**
	 * 设置：应答后转接目的分机：（IVR菜单名字或者FIFO队列名字，机器人“8888”，这个就是机器人接口的calleeid,可以自己设置其他的，dialplan的匹配规则也同同样修改就可以）
	 */
	public void setDestinationExtension(String destinationExtension) {
		this.destinationExtension = destinationExtension;
	}
	/**
	 * 获取：应答后转接目的分机：（IVR菜单名字或者FIFO队列名字，机器人“8888”，这个就是机器人接口的calleeid,可以自己设置其他的，dialplan的匹配规则也同同样修改就可以）
	 */
	public String getDestinationExtension() {
		return destinationExtension;
	}
	/**
	 * 设置：应答后转接目的拨号方案：（“XML”）
	 */
	public void setDestinationDialplan(String destinationDialplan) {
		this.destinationDialplan = destinationDialplan;
	}
	/**
	 * 获取：应答后转接目的拨号方案：（“XML”）
	 */
	public String getDestinationDialplan() {
		return destinationDialplan;
	}
	/**
	 * 设置：应答后转接目的上下文：（“IVR”或者”FIFO”,机器人”public”或者”default”,具体看dialplan配置）
	 */
	public void setDestinationContext(String destinationContext) {
		this.destinationContext = destinationContext;
	}
	/**
	 * 获取：应答后转接目的上下文：（“IVR”或者”FIFO”,机器人”public”或者”default”,具体看dialplan配置）
	 */
	public String getDestinationContext() {
		return destinationContext;
	}
	/**
	 * 设置：外呼比率：（呼叫并发等于空闲数量乘以外呼比率，机器人不要设置。）
	 */
	public void setSchedulingPolicyRatio(Float schedulingPolicyRatio) {
		this.schedulingPolicyRatio = schedulingPolicyRatio;
	}
	/**
	 * 获取：外呼比率：（呼叫并发等于空闲数量乘以外呼比率，机器人不要设置。）
	 */
	public Float getSchedulingPolicyRatio() {
		return schedulingPolicyRatio;
	}
	/**
	 * 设置：调度队列：（根据这个队列确定空闲坐席,如果为空，会使用maximumcall作为任务的最大并发。没有队列的，不要设置）
	 */
	public void setSchedulingQueue(String schedulingQueue) {
		this.schedulingQueue = schedulingQueue;
	}
	/**
	 * 获取：调度队列：（根据这个队列确定空闲坐席,如果为空，会使用maximumcall作为任务的最大并发。没有队列的，不要设置）
	 */
	public String getSchedulingQueue() {
		return schedulingQueue;
	}
	/**
	 * 设置：拨号串格式：（%s 匹配电话号码）
	 */
	public void setDialFormat(String dialFormat) {
		this.dialFormat = dialFormat;
	}
	/**
	 * 获取：拨号串格式：（%s 匹配电话号码）
	 */
	public String getDialFormat() {
		return dialFormat;
	}
	/**
	 * 设置：域名：（用于支持多租户）
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}
	/**
	 * 获取：域名：（用于支持多租户）
	 */
	public String getDomain() {
		return domain;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：呼叫通知类型：（0：不通知，1：呼叫失败通知，2：呼叫成功和失败都通知。）
	 */
	public void setCallNotifyType(Integer callNotifyType) {
		this.callNotifyType = callNotifyType;
	}
	/**
	 * 获取：呼叫通知类型：（0：不通知，1：呼叫失败通知，2：呼叫成功和失败都通知。）
	 */
	public Integer getCallNotifyType() {
		return callNotifyType;
	}
	/**
	 * 设置：呼叫通知URL：（如果配置了URL，呼叫结束会根据call_notify_type配置调用这个URL通知）
	 */
	public void setCallNotifyUrl(String callNotifyUrl) {
		this.callNotifyUrl = callNotifyUrl;
	}
	/**
	 * 获取：呼叫通知URL：（如果配置了URL，呼叫结束会根据call_notify_type配置调用这个URL通知）
	 */
	public String getCallNotifyUrl() {
		return callNotifyUrl;
	}
	/**
	 * 设置：Originate Variables：（用于自定于呼出参数，需要用{}包围参数。）
	 */
	public void setOriginateVariables(String originateVariables) {
		this.originateVariables = originateVariables;
	}
	/**
	 * 获取：Originate Variables：（用于自定于呼出参数，需要用{}包围参数。）
	 */
	public String getOriginateVariables() {
		return originateVariables;
	}
	/**
	 * 设置：拨号超时：（_开头的字段是可扩展字段，自己添加字段不要用_作为字段名。）
	 */
	public void setOriginateTimeout(Integer originateTimeout) {
		this.originateTimeout = originateTimeout;
	}
	/**
	 * 获取：拨号超时：（_开头的字段是可扩展字段，自己添加字段不要用_作为字段名。）
	 */
	public Integer getOriginateTimeout() {
		return originateTimeout;
	}
	/**
	 * 设置：主叫号码：（设置透传号码，就是送给网关的callerid,可以通过这个参数配合GOIP实现，控制使用那些端口呼出。）
	 */
	public void setOriginationCallerIdNumber(String originationCallerIdNumber) {
		this.originationCallerIdNumber = originationCallerIdNumber;
	}
	/**
	 * 获取：主叫号码：（设置透传号码，就是送给网关的callerid,可以通过这个参数配合GOIP实现，控制使用那些端口呼出。）
	 */
	public String getOriginationCallerIdNumber() {
		return originationCallerIdNumber;
	}
	/**
	 * 设置：是否忽略早期媒体：（注意：请不要设置,除非你很懂freeswitch.可以自己设置其他值。）
	 */
	public void setIgnoreEarlyMedia(String ignoreEarlyMedia) {
		this.ignoreEarlyMedia = ignoreEarlyMedia;
	}
	/**
	 * 获取：是否忽略早期媒体：（注意：请不要设置,除非你很懂freeswitch.可以自己设置其他值。）
	 */
	public String getIgnoreEarlyMedia() {
		return ignoreEarlyMedia;
	}
}
