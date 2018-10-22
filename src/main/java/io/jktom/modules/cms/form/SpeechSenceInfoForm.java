package io.jktom.modules.cms.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-16 17:30:19
 */

public class SpeechSenceInfoForm {


	@NotNull(message="话术Id不能为空")
	private Long speechId;

	/**
	 * 话术名称
	 */
	@NotBlank(message="话术名称不能为空")
	private String speechName;

	/**
	 * 话术备注
	 */
	private String speechMark;


	public Long getSpeechId() {
		return speechId;
	}

	public void setSpeechId(Long speechId) {
		this.speechId = speechId;
	}

	public String getSpeechName() {
		return speechName;
	}

	public void setSpeechName(String speechName) {
		this.speechName = speechName;
	}

	public String getSpeechMark() {
		return speechMark;
	}

	public void setSpeechMark(String speechMark) {
		this.speechMark = speechMark;
	}
}
