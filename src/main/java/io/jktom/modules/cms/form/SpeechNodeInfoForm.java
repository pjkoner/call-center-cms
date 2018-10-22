package io.jktom.modules.cms.form;

/**
 * @author pjk
 * @date 2018-10-22 10:37
 * @since
 */
public class SpeechNodeInfoForm {

    private String speechNodeName;

    private Long speechNodeId;


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
