package org.example.practice._functionalDeclarativeProgamming.readingPrac;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

interface WithoutLambda {
     public void draw();
}
public class  Lambda {
    public static void main(String[] ard) {
        int width = 10;

        WithoutLambda withoutLambda = new WithoutLambda() {
            public void draw() {
                System.out.println("Drawing " + width);
            }

        };
        withoutLambda.draw();
    }
}
interface Sayable{
     public String say();
}
//No parameter lambda
class LambdaExpressionExpression3{
     public  static void main(String [] args){
         Sayable s=()->{
             return "I have nothing to say ";
         };
        System.out.println(s.say());
     }
}
//Single parameter
interface Sayable1 {
     public String say(String name );
}
class LambdaExpression2 {
    public static void main(String []args){
        Sayable1 s=(name)->{
            return  "hello, "+name;
        };
        System.out.println(s.say("James"));
        Sayable1 s2 = name ->{
            return "Hallo, "+ name;
        };
       System.out.println( s2.say("James"));
    }

}
interface Addable{
     int add(int a, int b);
}
class LambdaExpression{
     public static void main(String[] args){
         Addable ad1 =(a,b)->(a+b);
         System.out.println(ad1.add(10,20));

         Addable ad2 = (int a, int b)->(a+b);
         System.out.print(ad2.add(100,500));

     }

}
// For list
class LambdaExpressionEx7{
     public static void main(String [] args){
         List<String> list = new ArrayList<>();
         list.add("James");
         list.add("Peter");
         list.add("John");
         list.add("Busayomi");
         list.forEach(
                 (n)->System.out.println(n)
         );
     }
}
// Java Lambda Expression Example : Multiple Statement
interface Sayable2{
    String say(String message);
}
class LambdaEx9{
    public static void main(String [] args) {
        Sayable2 person = (message) -> {
            String st = "Tayo";
            String st2 = st + message;
            return st2;
        };
    System.out.println(person.say("  It is the lord's doing "));
    }
}

// Creating Thread
class LambdaExampleEx10{
    public static void main(String[]args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running-----");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2=()->{
            System.out.println("thread2 is running ......");
        };
        Thread t2  = new Thread(r2);
        t2.start();

    }

}
class Product{
    int id;
    String name ;
    float price;
    public Product (int id, String name, float price){
        super();
        this. id= id;
        this.name= name;
        this. price = price;
    }
}
// Comparator
class LambdaExpressionEx10{
    public static void main(String[] args) {
        List <Product > list = new ArrayList<>();
        list.add(new Product(1,"HP Laptop ", 2500f));
        list.add(new Product(2,"keyboard ", 500f));
        list.add(new Product(3,"Dell Mouse", 300f));
        System.out.println("Sorting on the basis of name ......");
        Collections.sort(list, (p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p: list ){
            System.out.println(p.id+ " "+p.name+ " "+ p.price);
        }
    }
}
// Filter and Iterate through the Collection Data
class Product1{
    int id;
    String name;
    float price;
    public Product1( int id, String name, float price ){
        super();
        this.id = id;
        this.name= name;
        this.price= price;
    }
}
class LambdaExpressionEx12{
    public static void main(String[] args) {
        List<Product1> list1 = new ArrayList<>();
        list1.add(new Product1(1," Samsung", 1700f));
        list1.add(new Product1(2," Iphone", 17000f));
        list1.add(new Product1(3," Nokia", 1500f));
        list1.add(new Product1(4," Redmi", 25000f));
        list1.add(new Product1(5," Lenovo", 19000f));
        Stream<Product1> filteredData = list1.stream().filter(p->p.price>2000);
        list1.forEach(product1->System.out.println(product1.id +" "+ product1.name+ ": "+ product1.price));
        System.out.println();
        filteredData.forEach(product1->System.out.println(product1.id +" "+ product1.name+ ": "+ product1.price));
    }
}
// Event listener
class LambdaEventListener{
    public static void main(String[] args) {
        JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b= new JButton("Say");
        b.setBounds(80,100,70,30);
        b.addActionListener(e->{tf.setText("Peter Concept");});
        JFrame f = new JFrame();
        f.add(tf); f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300,200);
        f.setVisible(true);
    }
}