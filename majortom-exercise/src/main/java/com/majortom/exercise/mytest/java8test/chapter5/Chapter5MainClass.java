package com.majortom.exercise.mytest.java8test.chapter5;

import com.majortom.exercise.mytest.java8test.chapter5.entiy.TernaryNumber;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * <p>
 * 求三元数：a*a+b*b=c*c
 * </P>
 *
 * @author Major Tom
 * @since 2022/2/21 13:13
 */
public class Chapter5MainClass {
    public static void main(String[] args) {
        List<TernaryNumber> collect = IntStream.rangeClosed(1, 100)
                .boxed()
                .flatMap(x -> IntStream.rangeClosed(x, 100)
                        .mapToObj(y -> new TernaryNumber(x, y, Math.sqrt(x * x + y * y)))
                        .filter(t -> t.getC() % 1 == 0))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        //1.显式创建流
        Stream<String> stringStream = Stream.of("Java8", "Lambda", "Ln", "In", "Action");
        stringStream.map(String::toUpperCase)
                .forEach(System.out::println);
        //2.从文件生成流
        long uniqueWords = 0;
        try (Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
            System.out.println("uniqueWords is : " + uniqueWords);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //3.无限流-迭代
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
        //4.斐波那契数列
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println(t[0]));
        //5.斐波那契元组
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));
        //6.无限流-生成
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

    }
}
