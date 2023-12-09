package org.example.practice._functionalDeclarativeProgamming.video;

import java.util.List;
import java.util.stream.Collectors;

import static org.example.practice._functionalDeclarativeProgamming.video.Gender.Female;
import static org.example.practice._functionalDeclarativeProgamming.video.Gender.Male;

public class _FunctionalProgramming {

    public static void main(String[] args) {
        List<Person>personList=List.of( new Person("James", 12, Male),new Person("Peter", 22, Male),
        new Person("Julia", 20, Female  ),
        new Person("Euodias", 23, Female));
   List<Person>females= personList.stream().filter(person -> Female.equals(person.gender)).toList();
   females .forEach(System.out:: println);
   List<Person>males = personList.stream().filter(person -> person.gender.equals(Male )).collect(Collectors.toList());
   males.forEach(System.out::println);

        }

    }

    class Person{
       String name;
       int age;
       Gender gender;



        public Person(String name, int age, Gender gender) {
            this.name = name;
            this.age = age;
            this .gender= gender;
        }
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }
    }

