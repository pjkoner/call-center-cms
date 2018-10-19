package io.jktom.modules.cms.vo;

/**
 * @author pjk
 * @date 2018-10-18 19:19
 * @since
 */
public class SpeechSenceVO {

    private String speechId;

    private String speechName;

    private String mark;

    private Integer status;

    public String getSpeechId() {
        return speechId;
    }

    public void setSpeechId(String speechId) {
        this.speechId = speechId;
    }

    public String getSpeechName() {
        return speechName;
    }

    public void setSpeechName(String speechName) {
        this.speechName = speechName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
