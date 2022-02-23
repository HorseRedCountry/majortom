package com.majortom.exercise.mytest.java8test.chapter7.entity;

import java.util.concurrent.RecursiveTask;

/**
 * <p>
 * 分支/合并 并行求和
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/23 13:16
 */
public class ForkJoinSumCalculator extends RecursiveTask<Long> {
    /**
     * 要求和的数组
     */
    private final long[] numbers;
    /**
     * 子任务处理的数组内的起始位置
     */
    private final int start;
    /**
     * 子任务处理的数组内的终止位置
     */
    private final int end;
    /**
     * 不再将任务分解为子任务的数组大小
     */
    public static final long THRESHOLD = 10_000;

    /**
     * 公共构造函数，用于创建主任务
     *
     * @param numbers 要求和的数组
     */
    public ForkJoinSumCalculator(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    /**
     * 私有构造函数，用于以递归的方式为主任务创建子任务
     *
     * @param numbers /
     * @param start   /
     * @param end     /
     */
    private ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    /**
     * 在子任务不可在分解时计算结果
     *
     * @return /
     */
    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            return computeSequentially();
        }
        ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length / 2);
        leftTask.fork();
        ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length / 2, end);
        Long rightResult = rightTask.compute();
        Long leftResutl = leftTask.join();
        return rightResult + leftResutl;
    }

}
