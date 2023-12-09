package org.example.practice._functionalDeclarativeProgamming.video._streams;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        String value="adedinijames28@gmail.com";

                Optional.ofNullable(value)
//                .orElseGet(()->"default value"); gets a value , if the value is null. then it displays the default value
                //.orElseThrow(()->new IllegalStateException("Exception")) ; throws exception
                        //.ifPresent(email-> System.out.println("sending a mail to "+ email));
                .ifPresentOrElse(

                        email->System.out.println("sending a mail to "+ value),()->{
                            System.out .println("cannot send a mail");

                        });

    }
}
