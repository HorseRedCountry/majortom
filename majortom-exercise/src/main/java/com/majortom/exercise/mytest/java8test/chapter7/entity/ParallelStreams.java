package com.majortom.exercise.mytest.java8test.chapter7.entity;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/22 19:59
 */
public class ParallelStreams {
    /**
     * 计算从1到n的所有数字的和
     *
     * @param n /
     * @return /
     */
    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, Long::sum);
    }

    /**
     * 计算从1到n的所有数字的和--并行流
     *
     * @param n /
     * @return /
     */
    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 0L; i < n; i++) {
            result += i;
        }
        return result;
    }

    public static long rangedSum(long n) {
        return LongStream.rangeClosed(1, n)
                .reduce(0L, Long::sum);
    }

    public static long parallelRangeSum(long n) {
        return LongStream.rangeClosed(1, n)
                .parallel()
                .reduce(0L, Long::sum);
    }

    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinSumCalculator task = new ForkJoinSumCalculator(numbers);
        return new ForkJoinPool().invoke(task);
    }
}
