package com.java8.pojo;

public class Person {

    private String fName;
    private String lName;
    private int age;

    public Person (final String fName, final String lName, final int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public String getfName () {
        return fName;
    }

    public void setfName (final String fName) {
        this.fName = fName;
    }

    public String getlName () {
        return lName;
    }

    public void setlName (final String lName) {
        this.lName = lName;
    }

    public int getAge () {
        return age;
    }

    public void setAge (final int age) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "Person{" +
                       "fName='" + fName + '\'' +
                       ", lName='" + lName + '\'' +
                       ", age=" + age +
                       '}';
    }
}
