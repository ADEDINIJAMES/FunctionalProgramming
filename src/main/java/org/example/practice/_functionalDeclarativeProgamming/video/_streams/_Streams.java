package org.example.practice._functionalDeclarativeProgamming.video._streams;

import org.example.practice._functionalDeclarativeProgamming.video.Gender;


import java.util.List;
import java.util.stream.Collectors;

import static org.example.practice._functionalDeclarativeProgamming.video.Gender.Female;
import static org.example.practice._functionalDeclarativeProgamming.video.Gender.Male;

public class _Streams {
    public static void main(String[] args) {
        List<Person> personList=List.of( new Person("James", 12, Male),new Person("Peter", 22, Male),
                new Person("Julia", 20, Female  ),
                new Person("Euodias", 23, Female));
//        personList.stream()
//                .map(person -> person.name )
//                .mapToInt(String::length)
//                .forEach(System.out::println);
boolean contaiansFeamale=personList.stream().allMatch(person -> Female.equals(person.gender));
        System.out.println(contaiansFeamale);
//        .matchnone will match fo anythin or type not inside
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


