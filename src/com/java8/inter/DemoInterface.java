package com.java8.inter;

interface Phone {
    void call();
    default void message() {
        System.out.println("Sent");
    }
}

class AndroidPhone implements Phone {
    public void call() {
        System.out.println("Calling");
    }
    public void message() {
        System.out.println("Message");
    }
}

public class DemoInterface {
    public static void main(String... s) {
        Phone p = new AndroidPhone();
        p.call();
        p.message();
    }
}
