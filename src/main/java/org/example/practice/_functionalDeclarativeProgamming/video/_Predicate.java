package org.example.practice._functionalDeclarativeProgamming.video;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("08066378690"));
        System.out.println(isPhoneNumberValid("07066378690"));
        System.out.println(isPhoneNumberValid("0706637869"));
        System.out.println("");
        System.out.println(isPhoneNumberValue.test("08066378690"));
        System.out.println(isPhoneNumberValue. test("07066378690"));
        System.out.println(isPhoneNumberValue.test("0706637869"));
        System.out.println("");
        System.out.println(phoneNumberContain.test("0706637869"));
        System.out.println(phoneNumberContain.test("0706607869"));
        System.out.println("");

        System.out.println(" is phone numebr valid and contain :"+
                isPhoneNumberValue.or(phoneNumberContain).test("0706607869")
        );
        System.out.println(" is phone numebr valid and contain :"+
                isPhoneNumberValue.or(phoneNumberContain).test("07066378")
        );
        System.out.println("");

        System.out.println(" is phone numebr valid and contain :"+
                phoneNumberContain.test("07066378mm"));


    }

    // Imperative Programming
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    }
    //Declarative Programming
 static Predicate<String> isPhoneNumberValue= phoneNumber->
            phoneNumber.startsWith("07")&&phoneNumber.length()==11;
    static Predicate<String> phoneNumberContain= phone->
           phone.contains("3");

    //Bi predicate..
    BiPredicate<String,String>isPhoneValidVsShow= (phoneN, id)->
            phoneN.startsWith("07")&& phoneN.contains(id)&&phoneN.length()==11;

}
