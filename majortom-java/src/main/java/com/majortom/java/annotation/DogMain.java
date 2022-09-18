package com.majortom.java.annotation;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/9/18 16:44
 */
public class DogMain {
    public static void main(String[] args) {
        MyDog myDog= (MyDog) AnnotionInjection.getBean(new MyDog());
        System.out.println(myDog.getName());
    }
}
