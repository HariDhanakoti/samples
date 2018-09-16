package com.java8.lambda;

import com.java8.pojo.Person;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LambdaFunctionalInterfaces {

    public static void main(String... s) {
        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 70),
                new Person("John", "Brad", 26),
                new Person("Brad", "Pit", 45),
                new Person("Dwyane", "Johnson", 23),
                new Person("Scarlet", "Johnson", 22)
        );

        Collections.sort(personList, (p1, p2) -> p2.getlName().compareTo(p1.getlName()));

        System.out.println("Printing all");
        printConditionally(personList, p -> true);

        System.out.println("Printing Lname starts with'B'");
        printConditionally(personList, person -> person.getlName().startsWith("B"));

        System.out.println("Printing Fname starts with'J'");
        printConditionally(personList, person -> person.getfName().startsWith("J"));

        System.out.println();
        printConditionally(personList, person -> person.getAge() > 40);
    }

    private static void printConditionally(List<Person> personList, Predicate<Person> predicate) {
        personList.forEach(person -> {
            if (predicate.test(person)) {
                System.out.println(person.toString());
            }
        });
    }
}