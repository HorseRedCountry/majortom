package com.majortom.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Person {

    private Long id;

    private Integer age;

    private String name;

    private String nickname;

}
