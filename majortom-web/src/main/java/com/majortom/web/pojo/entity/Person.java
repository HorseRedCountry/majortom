package com.majortom.web.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/8/17 12:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("person")
public class Person implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField
    private Integer age;

    @TableField
    private String name;

    @TableField
    private String nickName;

}
