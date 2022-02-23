package com.majortom.exercise.mytest.java8test.chapter7;


import com.majortom.exercise.mytest.java8test.chapter7.entity.ParallelStreams;

import java.util.function.Function;

/**
 * <p>
 *
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/22 19:39
 */
public class Chapter7MainClass {

    public static void main(String[] args) {
        System.out.println("Sequential sum done in: " + measureSumPerf(ParallelStreams::sequentialSum, 10_000_000) + "msecs");
        System.out.println("Parallel sum done in: " + measureSumPerf(ParallelStreams::parallelSum, 10_000_000) + "msecs");
        System.out.println("Inerative sum done in: " + measureSumPerf(ParallelStreams::iterativeSum, 10_000_000) + "msecs");
        System.out.println("Range sum done in: " + measureSumPerf(ParallelStreams::rangedSum, 10_000_000) + "msecs");
        System.out.println("Parallel Range sum done in: " + measureSumPerf(ParallelStreams::parallelRangeSum, 10_000_000) + "msecs");
        System.out.println("Fork Join sum done in: " + measureSumPerf(ParallelStreams::forkJoinSum, 10_000_000) + "msecs");
    }


    /**
     * 测量对前n个自然数求和的函数的性能
     *
     * @param adder 函数
     * @param n     前n个数
     * @return 时间
     */
    public static long measureSumPerf(Function<Long, Long> adder, long n) {
        long fatest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            //System.out.println("Result: " + sum);
            if (duration < fatest) {
                fatest = duration;
            }
        }
        return fatest;
    }
}
