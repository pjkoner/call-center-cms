package io.jktom.modules.cms.vo;

/**
 * @author pjk
 * @date 2018-10-17 11:48
 * @since
 */
public class UserInfoVO {

    private String userName;

    private String telephone;

    private Long companyId;

    private String companyName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
