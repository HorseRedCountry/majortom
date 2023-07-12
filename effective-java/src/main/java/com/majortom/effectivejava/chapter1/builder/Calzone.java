package com.majortom.effectivejava.chapter1.builder;

/**
 * <p>
 * calzone--馅饼
 * </p>
 *
 * @author Major Tom
 * @date 2023/7/12 21:20
 **/
public class Calzone extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {

        //sauceInside--里面有酱汁
        private boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }
}
