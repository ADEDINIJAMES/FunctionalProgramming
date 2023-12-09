package org.example.practice._functionalDeclarativeProgamming.video.finals;

import java.util.stream.Stream;

public class Lambdas {
    public static void main(String[] args) {
        Stream.of("ananas", "oranges", "apple", "pear", "banana")
                .filter(s -> s.startsWith("a")) // 1. Filter first
                .map(String::toUpperCase)       // 2. Process
                .sorted(String::compareTo)      // 3. Sort
                .forEach(System.out::println);
    }

}
//// properties of functional programming
//No state= the should not depend on state(eg global state)
//    No side effect= no effect outside
//Higher Order Functions
//* the function takes one or more functionns as parameters.
//the function returns another function.
//
//Pure functions
