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
@TableName("biz_company_info")
public class BizCompanyInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long companyId;
	/**
	 * 
	 */
	private String companyName;
	/**
	 * 
	 */
	private String companyAddr;
	/**
	 * 联系人
	 */
	private String contactsName;
	/**
	 * 
	 */
	private String contactsTelphone;
	/**
	 * 
	 */
	private String contactsAddr;

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
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/**
	 * 获取：
	 */
	public String getCompanyName() {
		return companyName;
	}
	/**
	 * 设置：
	 */
	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}
	/**
	 * 获取：
	 */
	public String getCompanyAddr() {
		return companyAddr;
	}
	/**
	 * 设置：联系人
	 */
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	/**
	 * 获取：联系人
	 */
	public String getContactsName() {
		return contactsName;
	}
	/**
	 * 设置：
	 */
	public void setContactsTelphone(String contactsTelphone) {
		this.contactsTelphone = contactsTelphone;
	}
	/**
	 * 获取：
	 */
	public String getContactsTelphone() {
		return contactsTelphone;
	}
	/**
	 * 设置：
	 */
	public void setContactsAddr(String contactsAddr) {
		this.contactsAddr = contactsAddr;
	}
	/**
	 * 获取：
	 */
	public String getContactsAddr() {
		return contactsAddr;
	}
}
