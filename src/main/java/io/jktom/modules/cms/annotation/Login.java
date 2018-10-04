package io.jktom.modules.cms.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018/9/23 14:30
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
