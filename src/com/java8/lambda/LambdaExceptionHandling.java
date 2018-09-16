package com.java8.lambda;

import com.java8.pojo.Person;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExceptionHandling {

    public static void main(String... s) {
        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 70),
                new Person("John", "Brad", 26),
                new Person("Brad", "Pit", 45),
                new Person("Dwyane", "Johnson", 23),
                new Person("Scarlet", "Johnson", 22),
                new Person("Dimmy", "Doe", 12)
        );

        personList.forEach(lambdaWrapper(i -> i.getAge() > 18, i -> System.out.println(i)));
    }

    static Consumer<Person> lambdaWrapper(Predicate<Person> predicate, Consumer<Person> consumer) {
        return i -> {
            try {
                if (predicate.test(i)) {
                    consumer.accept(i);
                } else {
                    throw new Exception("Person isn't eligible to cast his/her vote");
                }
            } catch (ArithmeticException | NullPointerException npe) {
                System.err.println("Exception occured : " + npe.getMessage());
            } catch (Exception e) {
                System.err.println("Exception occured : " + e.getMessage());
            }
        };
    }
}
