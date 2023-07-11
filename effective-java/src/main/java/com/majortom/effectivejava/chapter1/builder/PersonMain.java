package com.majortom.effectivejava.chapter1.builder;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/11 22:49
 **/
public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person.Builder("MajorTom", 26, 1)
                .description("Man")
                .email("mylove103@foxmail.com")
                .phone("123456")
                .build();
        System.out.println(person.toString());
    }
}
