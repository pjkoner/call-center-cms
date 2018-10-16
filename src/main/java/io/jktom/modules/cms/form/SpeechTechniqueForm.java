package io.jktom.modules.cms.form;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-16 17:30:19
 */

public class SpeechTechniqueForm {


	/**
	 * 话术名称
	 */
	@NotBlank(message="话术名称不能为空")
	private String speechName;

	/**
	 * 话术备注
	 */
	private String speechMark;

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
