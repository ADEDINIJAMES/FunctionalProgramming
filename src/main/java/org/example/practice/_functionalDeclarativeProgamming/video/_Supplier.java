package org.example.practice._functionalDeclarativeProgamming.video;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBCconnection());
        System.out.println(getDBCConnectionSupplier.get());
        System.out.println( peopleList.get());
    }
    static String getDBCconnection(){
        return "https://www.nou.ng";
    }
    // Supply simply returns any value you ask it to return
    static Supplier<String>getDBCConnectionSupplier= ()->{
        return "https://www.nou.ng";
    };
    static Supplier<List<String>> peopleList= ()->
            List.of("Pastor", "Reverend", "Teacher");


}
