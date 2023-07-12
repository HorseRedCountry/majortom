package com.majortom.effectivejava.chapter1.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * <p>
 * Builder模式---类层次结构Demo
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/12 21:05
 **/
public abstract class Pizza {

    //ham--火腿  mushroom--蘑菇  pepper--胡椒  sausage--火腿
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    ;

    //topping--配料
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        //Subclassed must override this method to return "this"
        protected abstract T self();

    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
