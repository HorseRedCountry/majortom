package com.majortom.security.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>
 *  用户实体
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/8 15:02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("person")
public class Person {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    @TableLogic
    private Integer isDeleted;

    private String username;

    private String password;
}
