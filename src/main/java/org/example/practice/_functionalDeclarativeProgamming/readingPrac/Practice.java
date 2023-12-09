package org.example.practice._functionalDeclarativeProgamming.readingPrac;


import org.example.practice._functionalDeclarativeProgamming.readingPrac.interfaceUsed.PracticeInterface;

public class Practice implements PracticeInterface {
//    @Override
//    public void move() {
//        PracticeInterface.super.move();
//    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Practice practice= new Practice();
        practice.move();
        Person person= new Person("James", "08166370378",12);
    }
    static class Person{
        String name;
        String phoneNumber;
        int id;

        public Person() {
        }

        public Person(String name, String phoneNumber, int id) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.id = id;
        }

    }
}
