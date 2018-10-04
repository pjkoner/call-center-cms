package io.jktom.common.validator.group;

import javax.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 23:15
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
