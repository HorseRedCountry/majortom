package com.majortom.security.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/8 15:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private Long id;

    private String username;

    private String password;
}
