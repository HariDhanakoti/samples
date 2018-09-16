package com.java8.lambda;

import com.java8.HelloStringTrimmer;

public class TypeInferenceExplained {

    public static void main (String... s) {
        printHelloStringTimmer(c -> c.trim().length());

        Thread myThread = new Thread (() -> System.out.println("Hello Thread"));
        myThread.run();
    }

    public static void printHelloStringTimmer(HelloStringTrimmer hsT) {
        System.out.println(hsT.trimString("    Hello    "));
    }
}
