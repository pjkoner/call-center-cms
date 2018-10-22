package io.jktom.modules.cms.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author pjk
 * @date 2018-10-22 10:37
 * @since
 */
public class SpeechNodeInfoForm {

    @NotBlank(message="话术名称不能为空")
    private String speechNodeName;

    private Long speechNodeId;


    private Long speechId;


    public Long getSpeechId() {
        return speechId;
    }

    public void setSpeechId(Long speechId) {
        this.speechId = speechId;
    }

    public Long getSpeechNodeId() {
        return speechNodeId;
    }

    public void setSpeechNodeId(Long speechNodeId) {
        this.speechNodeId = speechNodeId;
    }

    public String getSpeechNodeName() {
        return speechNodeName;
    }

    public void setSpeechNodeName(String speechNodeName) {
        this.speechNodeName = speechNodeName;
    }
}
