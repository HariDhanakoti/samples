package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

interface ShowInterface {
    void showMe (String name);
}

public class LambdaDemo {

    public static void main (String... s) {

        List<Integer> values = Arrays.asList(4,5,6,7,8,9);
        values.forEach( i -> System.out.println("i = " + i + " "));

        ShowInterface show1 = name -> System.out.println("Hello " + name);
        ShowInterface show2 = (name) -> System.out.println("Hello " + name);

        show1.showMe("McSteven");
        show2.showMe("Orchid");

    }

}
