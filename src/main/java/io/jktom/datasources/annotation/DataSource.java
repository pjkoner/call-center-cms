package io.jktom.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018/10/1 22:16
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}
