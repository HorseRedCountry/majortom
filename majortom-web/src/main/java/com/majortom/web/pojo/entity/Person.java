package com.majortom.web.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

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

    private Integer age;

    private String name;

    private String nickName;

    private Date gmtCreate;

    private String grade;


}
