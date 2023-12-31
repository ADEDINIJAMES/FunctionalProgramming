package org.example.practice._functionalDeclarativeProgamming.video.combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static org.example.practice._functionalDeclarativeProgamming.video.combinator.CustomerValidation.ValidationResult.*;

public interface CustomerValidation
        extends Function<Customer, CustomerValidation.ValidationResult >{
    static CustomerValidation isEmailValid(){
        return customer->customer.getEmail().contains("@")?
                SUCCESS:EMAIL_NOT_VALID;
    }
    static CustomerValidation isPhoneNumberValid(){
        return customer->customer.getPhoneNumber().startsWith("+0")?
                SUCCESS:PHONE_NUMBER_NOT_VALID;
    }
    static CustomerValidation isAdult(){
        return customer-> Period.between(customer.getDob(),LocalDate.now()).getYears()>16?
    SUCCESS:IS_NOT_AN_ADULT;
    }

  default   CustomerValidation and (CustomerValidation other){
        return customer -> {
            ValidationResult result =this.apply(customer);
           return result.equals(SUCCESS)? other.apply(customer): result ;
        };
  }




    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
