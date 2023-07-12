package com.majortom.effectivejava.chapter1.builder;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/12 21:24
 **/
public class PizzaMain {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION)
                .build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM)
                .sauceInside()
                .build();
    }
}
