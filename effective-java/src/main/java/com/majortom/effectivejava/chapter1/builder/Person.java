package com.majortom.effectivejava.chapter1.builder;

/**
 * <p>
 * 建造者模式
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/11 22:40
 **/
public class Person {
    private final String name;
    private final int age;
    private final int sex;
    private final String description;
    private final String email;
    private final String phone;

    public static class Builder {
        //Required parameters
        private final String name;
        private final int age;
        private final int sex;

        //Optional parameters
        private String description;
        private String email;
        private String phone;

        public Builder(String name, int age, int sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.description = builder.description;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return this.name + " | " + this.age + " | " + this.sex + " | " + this.description + " | " + this.email + " | " + this.phone;
    }

}
