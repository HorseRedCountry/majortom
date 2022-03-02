package com.majortom.exercise.mytest.java8test.chapter8.cor;

/**
 * <p>
 *  责任链模式：Chain of Responsibility。
 *  一个对象可能需要在完成一些工作后，将结果传递给另一个对象；这个对象接着做一些工作，再转交给下一个处理对象，以此类推。
 * </P>
 *
 * @author Major Tom
 * @since 2022/3/2 12:10
 */
public abstract class ProcessingObject<T> {

    protected ProcessingObject<T> sucessor;

    public void setSuccessor(ProcessingObject<T> sucessor) {
        this.sucessor = sucessor;
    }

    public T handle(T input) {
        T t = handWork(input);
        if (sucessor != null) {
            return sucessor.handle(t);
        }
        return t;
    }

    protected abstract T handWork(T input);

}
