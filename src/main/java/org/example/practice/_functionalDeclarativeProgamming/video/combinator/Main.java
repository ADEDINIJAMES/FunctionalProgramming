package org.example.practice._functionalDeclarativeProgamming.video.combinator;

import java.time.LocalDate;
import java.time.Month;

import static org.example.practice._functionalDeclarativeProgamming.video.combinator.CustomerValidation.*;

public class Main {
    public static void main(String[] args) {
        Customer customer= new Customer(
                "James",
                "adedinijames28@gmail.com",
                "+08166370378",
                LocalDate.of(2015, Month.JANUARY,23)

        );
//        CustomerValidatorService validatorService = new CustomerValidatorService();
//        System.out.println(validatorService.isCustomerValid(customer));
        //Using combinator pattern
    ValidationResult result=isEmailValid()
            .and(isPhoneNumberValid())
                    .and(isAdult())
                    .apply(customer);
        System.out.println(result);
        if(result!=ValidationResult.SUCCESS){
            throw new IllegalStateException();
        }

    };
}
// combination all other methods are combined into one method called combinator.