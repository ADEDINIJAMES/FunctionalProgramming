package org.example.practice.algorithms;

import java.util.Arrays;




public class Algo4 {

        public static int[] digitize(long n) {
            if(n== 0){
                return new int[]{0};
            }else{
                String[]num = String.valueOf(n).split("");
                int[]b= new int[num.length];
                for (int i = 0; i<num.length; i++){
                    b[i]= Integer.parseInt(num[num.length-1-i]);
                }
                return b;
            }
        }
    }
//   import java.util.*;
//public class SmallestIntegerFinder {
//    public static int findSmallestInt(int[] args) {
//      Arrays.sort(args);
//    int b= args[0];
//        return b;
//
//
//    }

class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);

        int b = args[0];
        return b;


    }


        public static int solution(int number) {

            int counter = 0;
            int sum = 0;
            for (int i = 0; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                    counter++;
                }

            }
            return sum;
        }


    public static String repeatStr(final int repeat, final String string) {
        StringBuilder str = new StringBuilder();
        String s="";
        if (string.isBlank())
        {
            return string;

        }
        else{
            for(int i=0; i<= repeat-1;i++){
                s+=string;
            }
            String v= str.append(s).append(" ")
                    .toString().trim();

            return v;
        }

    }

    public static int points(String[] games) {

            int x=0;

            for(String b:games){
                String []a=b.split(":");
                if (Integer.parseInt(a[0])>Integer.parseInt(a[1])){
                    x+=3;
                }else if(Integer.parseInt(a[0])==Integer.parseInt(a[1])){
                    x+=1;
                }else{
                    x+=0;
                }

            }
            return x+=0;
        }
        public static int Zcounter=0;
        public static int Xcounter=0;
        public static boolean evenXAndO(String str) {
            char[] arr= str.toCharArray();

            for(int i=0; i<arr.length;i++ ){
                if ((arr[i]== 'x'|| arr[i]=='X')){
                    Xcounter++;
                }
            }
            for (int j=0; j<arr.length;j++){
                if (arr[j]=='o'||arr[j]=='O' ){
                    Zcounter++;
                }
            }
            if (Zcounter==Xcounter){
                return true;
            }else{
                return false;
            }

        }
//    public static boolean evenXAndO1(int[] str) {
//
////
////        for (int i = 0; i < str.length; i++) {
////            for (int j = i+1; j < str.length-1; j++) {
////
////            }
////        }
////
////    }
////
//
//    }
        //use hash map to instantly check for difference value, map will add index of
    // last occurrence of a num, don’t use same element twice;

public static String swap(String str){
//            char[]array = str.toCharArray();
//            int a= array.length-1;
//            int b= 0;
//            char temp;
//            for (int i=0 ; i< array.length;i++){
//                if (a>b) {
//                    temp = array[a];
//                    array[a] = array[b];
//                    array[b] = temp;
//                }
//            }
//            return Arrays.toString(array);
    StringBuilder word = new StringBuilder(str).reverse();
    String toStringWord = word.toString();
    String empty = "";
    System.out.println(word);


    String[] wordArr = toStringWord.split("");
    int a = 0;
    int b =wordArr.length-1 ;
    String temp ="";

    for(int i = 0; i < wordArr.length; i++){
        if (a<b) {
                    temp = wordArr[a];
                  wordArr[a] = wordArr[b];
                    wordArr[b] = temp;
             }
    }


    return Arrays.toString(wordArr);
}

    public static String reverseString(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
//    Question 2:
//    When logging into a secure system, the system often hides the actual
//    password and shows asterisks or dots instead. Implement a function
//    maskPassword that takes a password as input and returns a masked version
//    of it, with all characters replaced by asterisks except for the last four
//    characters.*/
    public static String ChangeString(String input ){
            char temp;
   char[] arr=  input.toCharArray();
            for(int i=0; i<arr.length-4; i++){
                temp=arr[i];
               arr[i]= '*';
            }
         return Arrays.toString(arr);
    }
//    public static String ChangeString1(String input ){
//String in="";
//for(int i=0; i<input.length();i++){
//    input.replaceAll(input.char(i)=="*");
//}
//    }
//You are building a user registration system, and you want to validate
//    email addresses. Write a function validateEmail that takes an email
//    address as input and returns true if it's a valid email address,
//    otherwise false. Valid email addresses should have the format
//    "username@domain.com". To protect user privacy, mask the username
//    with asterisks, revealing only the first and last characters.
public static String emailval(String input){
            char []email2= new char[]{};
            if(input.contains("@")&& input.length()>4&&input.contains(".")&&input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")){
                String[]email= input.split("@");
                System.out.println(Arrays.toString(email));
                email2 = email[0].toCharArray();

                char temp;
                for (int i= 1; i< email2.length-1; i++){
                    temp=email2[i];
                    email2[i]='*';
                }
//[]~

StringBuilder builder= new StringBuilder();
            builder.append(email2).append("@").append(email[1]);

                return builder.toString();
            }else {
                System.out.println(input +"Not valid");
                return (input +"Not valid") ;
            }

}//[a-zA-Z0-9+%-]
    public static boolean validateEmail(String email) {
        // Basic email validation
        if (email == null || !email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            return false;
        }
        // Mask the username
        int atIndex = email.indexOf('@');
        if (atIndex > 2) {
            char[] charArray = email.toCharArray();
            for (int i = 1; i < atIndex - 1; i++) {
                charArray[i] = '*';
            }
            return true;
        } else {
            return false;
        }
    }

//    In a messaging app, you want to implement a feature that shortens long
//    messages by replacing the middle part with ellipses (...) while
//    preserving the first and last few characters. Implement a function
//    shortenMessage that takes a message and an integer maxLength as
//    input, and returns the shortened message. If the message is already
//    shorter than or equal to the specified length, return the original
//    message.
public static String maskUsername(String username) {
    if (username == null || username.length() < 2) {
        return "";
    }

    char firstChar = username.charAt(0);
    char lastChar = username.charAt(username.length() - 1);

    // Create a string with asterisks except for the first and last characters
    return firstChar + "*".repeat(username.length() - 2) + lastChar;
}



public static String shortenMessage(String message, int maxLength) {
    if (message == null || message.length() <= maxLength) {
        return message;
    }
    int ellipsesLength = 3; // Length of "..."
    int remainingLength = maxLength - ellipsesLength;
    int prefixLength = remainingLength / 2;
    int suffixLength = remainingLength - prefixLength;
    String shortenedMessage = message.substring(0, prefixLength) + "..." + message.substring(message.length() - suffixLength);
    return shortenedMessage;
}
//    public static String shortenMessage1(String message, int maxLength) {
//        if (message == null || message.length() <= maxLength) {
//            return message;
//        }
//        int ellipsesLength = message.length()-maxLength;
//        int remainingLength = maxLength - ellipsesLength;
//        int prefixLength = remainingLength / 2;
//        int suffixLength = remainingLength - prefixLength;
//        String shortenedMessage = message.substring(0, prefixLength) + ".".repeat(ellipsesLength) + message.substring(message.length()-suffixLength);
//        return shortenedMessage;
//    }

    public static String areYouPlayingBanjo(String name) {
        char[]arr = name.toCharArray();
        if (arr[0]=='R'|| arr[0]=='r' ){
            return name+ " plays banjo";

        }else{
            return name+" does not play banjo";
        }
    }

        public static int getSum(int a, int b) {
            int c = 0;
            if (a == b) {
                return a;
            } else if (b > a) {
                for (int i = a; i <= b; i++) {
                    c += i;

                }
                return c;
            } else {
                for (int i = a; i >= b; i--) {
                    c += i;
                }
                return c;
            }
        }
    public static String bmi(double weight, double height) {
        double h = height*height;
        String b="";
        double bmi = weight/h;
        if (bmi<=18.5){
            b ="Underweight";
        }else if(bmi<= 25.0){
            b= "Normal";
        }else if (bmi<=30.0){
            b=  "Overweight";
        }else if(bmi>30.0){
            b ="Obese";
        }

        return b;

    }


        public static void main(String[] args) {
            System.out.println(solution(25));
            System.out.println(repeatStr(25, "Hello"));
            String[] a = new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "1:3", "1:4", "2:3", "2:4", "3:4"};
            System.out.println(points(a));
            System.out.println();
            System.out.println(evenXAndO("xo"));
            System.out.println(evenXAndO("O"));
            System.out.println(evenXAndO("XXXXOOOOXOOXOOXooooxooxxO"));
            System.out.println(swap("James"));
            System.out.println(reverseString("Hello"));
            System.out.println(ChangeString("Hello"));
            System.out.println(emailval("user123@example.com"));

            System.out.println();

            String email = "user123@example.com";
            boolean isValid = validateEmail(email);
            System.out.println(validateEmail(email));
            System.out.println(shortenMessage("I live in Nigeria", 5));
            System.out.println();
            System.out.println(maskUsername("user123@example.com"));
            System.out.println(areYouPlayingBanjo("Rick"));
            System.out.println(getSum(15,0));
            System.out.println(bmi(50.0, 7.0));



        }
    }