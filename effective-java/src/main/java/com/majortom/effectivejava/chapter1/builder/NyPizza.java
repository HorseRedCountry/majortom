package com.majortom.effectivejava.chapter1.builder;

import java.util.Objects;

/**
 * <p>
 *
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/12 21:13
 **/
public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
