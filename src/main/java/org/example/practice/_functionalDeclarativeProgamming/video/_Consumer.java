package org.example.practice._functionalDeclarativeProgamming.video;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

import static org.example.practice._functionalDeclarativeProgamming.video._Consumer.Customer.*;

public class _Consumer {
    public static void main(String[] args) {
        Customer james = new Customer("James", "08166370378");
        greetCustomerJava(james);
        greetCustomerFunctionalConsumer.accept(james);
        greetcustomer2bi(james,true);
        greetCustomerbi.accept(james,false);

    }

    static class Customer {
        String name;
        String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        // nomal Java method
        static void greetCustomerJava(Customer customer) {
            System.out.println("Hello " + customer.name + "  thanks for registering phone Number  " + customer.phoneNumber);

        }
        static void greetcustomer2bi(Customer customer, boolean showPhoneNumber){
            System.out.println("Hello " + customer.name + "  thanks for registering phone Number  " +(showPhoneNumber?customer.phoneNumber: "*******"));
        }

        //Using Functional Programming
        // Consumer<T> takes  one argument and returns nothing
        static Consumer<Customer> greetCustomerFunctionalConsumer = customer -> System.out.println("Hello " + customer.name + "  thanks for registering phone Number  " + customer.phoneNumber);
        static BiConsumer<Customer, Boolean>greetCustomerbi= (customer1,showPhoneNumber) ->System.out.println("Hello "+customer1.name + "  thanks for registering " +(showPhoneNumber? customer1.phoneNumber: "-------------"));
    }
}


