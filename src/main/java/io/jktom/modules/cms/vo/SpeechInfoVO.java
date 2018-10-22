package io.jktom.modules.cms.vo;

/**
 * @author pjk
 * @date 2018-10-22 9:40
 * @since
 */
public class SpeechInfoVO {

    private Long speechId;

    private Long speechNodeId;

    private String speechName;

    private Integer sortIndex;

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

    public String getSpeechName() {
        return speechName;
    }

    public void setSpeechName(String speechName) {
        this.speechName = speechName;
    }

    public Integer getSortIndex() {
        return sortIndex;
    }

    public void setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
    }
}
