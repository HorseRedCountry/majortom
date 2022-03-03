package com.majortom.exercise.mytest.java8test.chapter10;

import cn.hutool.core.date.DateTime;

import java.util.Optional;
import java.util.Properties;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/3 11:42
 */
public class Chapter10MainClass {
    public static void main(String[] args) {
        System.out.println(DateTime.now());
        Properties properties = new Properties();
        properties.setProperty("a", "5");
        properties.setProperty("b", "true");
        properties.setProperty("a", "5");
        System.out.println(readDuration(properties,"5"));

    }

    public static int readDuration(Properties props, String name) {
        return Optional.ofNullable(props.getProperty(name))
                .flatMap(OptionalUtility::stringToInt)
                .filter(i -> i > 0)
                .orElse(0);
    }


    /**
     * 直接调用
     *
     * @param person /
     * @return /
     */
    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unkonwn");
    }


    public Optional<Insurance> nullSafeFindCheapestInsurance(Optional<Person> person, Optional<Car> car) {
        return null;
    }


    ///**
    // * 深层质疑
    // *
    // * @param person /
    // * @return /
    // */
    //public String getCarInsuranceNameDeep(Person person) {
    //    if (null != person) {
    //        Car car = person.getCar();
    //        if (null != car) {
    //            Insurance insurance = car.getInsurance();
    //            if (null != insurance) {
    //                return insurance.getName();
    //            }
    //        }
    //    }
    //    return "Unknown";
    //}
    //
    ///**
    // * 过多的退出语句
    // *
    // * @param person /
    // * @return /
    // */
    //public String getCarInsuranceNameMuchReturn(Person person) {
    //    if (null == person) {
    //        return "Unknown";
    //    }
    //    Car car = person.getCar();
    //    if (null == car) {
    //        return "Unknown";
    //    }
    //    Insurance insurance = car.getInsurance();
    //    if (null == insurance) {
    //        return "Unknown";
    //    }
    //    return insurance.getName();
    //}
}
