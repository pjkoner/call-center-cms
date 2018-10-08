package io.jktom.modules.cms.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-08 10:03:15
 */
@TableName("autodialer_timerange")
public class AutodialerTimerangeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String uuid;
	/**
	 * 开始时间:(格式为 时:分:秒)
	 */
	private String beginDatetime;
	/**
	 * 结束时间:(例子 18:00:00)
	 */
	private String endDatetime;
	/**
	 * 所属的时间组
	 */
	private String groupUuid;

	/**
	 * 设置：
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：开始时间:(格式为 时:分:秒)
	 */
	public void setBeginDatetime(String beginDatetime) {
		this.beginDatetime = beginDatetime;
	}
	/**
	 * 获取：开始时间:(格式为 时:分:秒)
	 */
	public String getBeginDatetime() {
		return beginDatetime;
	}
	/**
	 * 设置：结束时间:(例子 18:00:00)
	 */
	public void setEndDatetime(String endDatetime) {
		this.endDatetime = endDatetime;
	}
	/**
	 * 获取：结束时间:(例子 18:00:00)
	 */
	public String getEndDatetime() {
		return endDatetime;
	}
	/**
	 * 设置：所属的时间组
	 */
	public void setGroupUuid(String groupUuid) {
		this.groupUuid = groupUuid;
	}
	/**
	 * 获取：所属的时间组
	 */
	public String getGroupUuid() {
		return groupUuid;
	}
}
