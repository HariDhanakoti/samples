package com.java8.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConstImpl implements Consumer<Integer> {

    public void accept(Integer i) {
        System.out.print("accept i = " + i +" ");
    }

}

public class DemoForEach {

    public static void main(String... s) {

        List<Integer> values = Arrays.asList(4,5,6,7,8,9);

        //Before 1.7
        for (int i = 0; i < values.size(); i++ ) {
            System.out.println("values.get(i) = " + values.get(i));
        }

        //With 1.7
        for (int i : values) {
            System.out.println("i = " + i);
        }

        //Internal loops from 1.8 with Lambda expression
        values.forEach( i -> System.out.print("i = " + i + " "));
        System.out.print("\n");
        Consumer<Integer> c = new ConstImpl();
        values.forEach(c);

        Consumer<Integer> newC = new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        values.forEach(newC);

        values.forEach(i -> System.out.println(i));
    }
}
