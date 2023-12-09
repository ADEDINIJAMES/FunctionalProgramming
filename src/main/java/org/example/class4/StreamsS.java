package org.example.class4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.Long.sum;

public class StreamsS {
    public static void main(String[] args) {
        List<String> listOfStrings= List.of("Hello", "Hi", "Condition", "Frontal", "Transpose", "Hidden", "Holocaust", "Confederate");
        System.out.println(listOfStrings);
//        Find all words with "C" as their starting character.
//        ii. Find all words with "o" as their second character.
        List<String>filtered= listOfStrings.stream().filter(e->e.startsWith("C")).toList();
        System.out.println(filtered);
        List<String> fiteredForo= listOfStrings.stream().filter(e->e.substring(1,2).equals("o")).toList();
        System.out.println(fiteredForo);
        System.out.println();
//        Change all words starting with "C"to have "s" in the end.
//                ii. Change all words starting with "H" to have " all" appended to them.
       List<String>map1= listOfStrings.stream().map(e->e.startsWith("C")? e+"s": e).toList();
//
      System.out.println(map1);


        //Sum the length of all the words  with "r" as their second character.
      int map2= listOfStrings.stream().filter(e->e.substring(1,2).equals("r")).mapToInt(e->e.length()).sum();
        System.out.println(map2);
        System.out.println();


//        Reducing
//        i. Sum the length all the words starting with "H".
//                ii. Sum the length of all the words  with "r" as their second character.
        int map3= listOfStrings.stream().filter(e->e.substring(0,1).equals("H")).mapToInt(e->e.length()).sum();
        System.out.println(map3);



//        Partitioning/Sort/Search
//        i. Create 4 arrays for words that starts with  and "T" by using partitioning
//        ii. Sort the array of words
//        iii. Find all words with "t" located within the last two characters.

        List<String> list = List.of("Hello", "Hi", "Condition", "Frontal", "Transpose", "Hidden", "Holocaust", "Confederate");
        Map<Boolean ,List<String>>listpart = list.stream(). collect(Collectors.partitioningBy(e->e.startsWith("T")));
        Map<Boolean ,List<String>>listpart2 = list.stream(). collect(Collectors.partitioningBy(e->e.startsWith("H")));
        Map<Boolean ,List<String>>listpart3 = list.stream(). collect(Collectors.partitioningBy(e->e.startsWith("C")));
        Map<Boolean ,List<String>>listpart4= list.stream(). collect(Collectors.partitioningBy(e->e.startsWith("F")));

        listpart.forEach((k,v)-> System.out.println("The key is  "+ k + ", The value is " +v));
      listpart2.forEach((k,v)-> System.out.println("The key is  "+ k + ", The value is " +v));
       listpart3.forEach((k,v)-> System.out.println("The key is  "+ k + ", The value is " +v));
  listpart4.forEach((k,v)-> System.out.println("The key is  "+ k + ", The value is " +v));

}}
