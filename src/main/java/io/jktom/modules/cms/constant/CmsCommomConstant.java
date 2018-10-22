package io.jktom.modules.cms.constant;

/**
 * @author pjk
 * @date 2018-10-18 11:57
 * @since
 */
public interface CmsCommomConstant {

    /**
     * token 过期时间
     */
    interface TOKEN_EXPIRE{

        int EXPIRE_TIME = 68400;

    }

    /**
     * 是否删除
     */
    interface IS_DELETE{

        /**删除*/
        int DELETE = 1;
        /**未删除*/
        int NOT_DELETE = 0;

    }

    /**
     * 话术状态
     */
    interface SPEECH_STATUS{

        /**全部*/
        int ALL = 0;

        /**未发布*/
        int NOT_ISSUE = 1;

        /**已发布*/
        int HAVE_ISSUE = 2;


    }









}
