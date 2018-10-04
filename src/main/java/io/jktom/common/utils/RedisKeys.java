package io.jktom.common.utils;

/**
 * Redis所有Keys
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 19:51
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
