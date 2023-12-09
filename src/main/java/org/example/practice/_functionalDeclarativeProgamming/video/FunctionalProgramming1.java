package org.example.practice._functionalDeclarativeProgamming.video;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalProgramming1 {
    public static void main(String[] args) {
        //Functions takes one argument
       int increment = increment(2);
      int increment2= incrementbyFunction.apply(3);
        System.out.println(increment);
        System.out.println(increment2);
       int multiply=multiplyBy20.apply(increment2);
        System.out.println(multiply);
        int functionChained= addBy2andThenMultiplyBy20.apply(4);
        System.out.println(functionChained);
        //BiFunction takes in 2 arguments
        System.out.println(
                biFunctionAddAndMultiply.apply(2,10));
        System.out.println(increment1(2,10));


    }



    // Imperative
    static int increment(int number){
        return number+2;


    }
    static int increment1(int numbertoAdd, int numbertoMultiple){
        return (numbertoAdd+2)*numbertoMultiple;
    }
    //Declarative Function<Input type,Output type>
    static Function<Integer,Integer> incrementbyFunction =
            number->number+2;
    static Function<Integer,Integer>multiplyBy20= number-> number*20;
//Chaining of functions using "andThen()"
    static Function<Integer, Integer> addBy2andThenMultiplyBy20= incrementbyFunction.andThen(multiplyBy20);

    //BiFunction takes 2 arguments; the last Integer is the output
    static BiFunction<Integer,Integer,Integer> biFunctionAddAndMultiply= ( numberToAdd, numberToMultiply)->  ((numberToAdd+2)*numberToMultiply);

}
