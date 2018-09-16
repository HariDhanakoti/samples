package com.java8.lambda;

import com.java8.HelloStringTrimmer;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

interface ShowInterface {
    void showMe (String name);
}

public class LambdaDemo {

    public static void main (String... s) {

        List<Integer> values = Arrays.asList(4,5,6,7,8,9);
        values.forEach( i -> out.println("i = " + i + " "));

        ShowInterface show1 = name -> out.println("Hello " + name);
        ShowInterface show2 = (name) -> out.println("Hello " + name);

        show1.showMe("McSteven");
        show2.showMe("Orchid");

        HelloworldInterface hellW = () -> out.println("Hello World");

        HelloStringInterface helloStringInterface = (a, b) -> a.concat(b);

        HelloStringTrimmer helloStringTrimmer = c -> c.trim().length();

        out.println(helloStringInterface.helloString("Hello", "String"));
        out.println(helloStringTrimmer.trimString("    Hello   "));

    }

}

interface HelloworldInterface {
    void helloWorld();
}

interface HelloStringInterface {
    String helloString(String a, String b);
}

