package org.example.practice._functionalDeclarativeProgamming.video.finals;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("John", null, firstName -> {
            System.out.println("no lastname was provided for " + firstName);
        });
        hello2("John", null, () -> {
            System.out.println("no lastname was provided");
        });

    }

    // Callbacks just like in javaScript
    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
        static void hello (String firstName, String lastName, Consumer < String > callback){
            System.out.println(firstName);
            if (lastName != null) {
                System.out.println(lastName);
            } else {
                callback.accept(firstName);
            }
        }
    }

