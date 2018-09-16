package com.java8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String... s) throws IOException {
        IntStream
                .range(1, 10)
                .forEach(System.out::print);
        System.out.println("\n");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        System.out.println("\n");
        System.out.println(
        IntStream
                .range(1, 10)
                .sum());

        System.out.println("\n");
        Stream.of("Adam", "Eva", "Albert")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\n");
        Stream.of("Adam", "Eva", "Jaquline", "Joe", "Don", "Jordon", "Jasper")
                .filter(x -> x.startsWith("J"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n");
        Arrays.stream(new int[] {2,4,6,8,10})
                .map( x -> x * x)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\n");
        Stream.of("Adam", "Eva", "Jaquline", "Joe", "Don", "Jordon", "Jasper")
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("j"))
                .forEach(System.out::println);

        System.out.println("\n");
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() < 50)
                .forEach(System.out::println);
        bands.close();

        System.out.println("\n");
        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("be"))
                .collect(Collectors.toList());
        bands2.forEach(x -> System.out.println(x));

        System.out.println("\n");
        double total1 = Stream.of(7.0, 1.0, 2.0)
               .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("total = " + total1);

        System.out.println("\n");
        double total2 = Stream.of(7.0, 1.0, 2.0)
                .filter(x -> x.doubleValue() > 1.0)
                .reduce(0.0, (Double a, Double b) -> a + b);

        System.out.println("total = " + total2);

        IntSummaryStatistics summaryStatistics = IntStream.of(7, 2, 19, 88, 73, 4, 10)
                .summaryStatistics();
        System.out.println("summaryStatistics = " + summaryStatistics);


    }
}
