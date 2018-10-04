package io.jktom.common.validator;

import io.jktom.common.exception.RRException;
import org.apache.commons.lang.StringUtils;

/**
 * 数据校验
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-03 15:50
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
