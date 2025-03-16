package com.java.practice;

// 1. DEFAULT AND STATIC INTERFACE METHODS

//interface Phone{
//    void call(String s);
//    default void message(){
//        System.out.println("Message is called from Interface directly using Default keyword");
//    }
//
//    static void message2(){
//        System.out.println("Message is called from Interface directly using static keyword");
//    }
//}
//
//class AndroidPhone implements Phone{
//
//    @Override
//    public void call(String s) {
//        System.out.println("Call is called from "+s);
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//        AndroidPhone p=new AndroidPhone();
//        p.call("Android Object");
//        p.message();
//        Phone.message2();
//
//        Phone p1=new AndroidPhone();
//        p1.call("Phone Object");
//        p1.message();
//        Phone.message2();
//    }
//}


// 2. ForEach METHOD

//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8);
//
//        for (Integer l:list){
//            System.out.println(l);
//        }
//
//        list.forEach(i -> System.out.println(i));// ForEach is used along with lambda Expression
//    }
//}

// 3. Anonymous Inner Class

//interface Demo{
////    void show();
//    void show(int i);
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Demo d;
//        d=new Demo() {
//            @Override
//            public void show() {
//                System.out.println("Hello Anonymous Inner Class!!!");
//            }
//        };
//        d.show();

//        d= ()-> {
//            System.out.println("Lambda Expression");
//        };
//        d.show();

//        d=(i)->{
//            System.out.println(i+" is Printed using Lambda Expression");
//        };
//        d.show(1);

//        d=i -> System.out.println("Final Lambda Expression "+i);
//        d.show(2);
//    }
//
//}

// 4. Method Reference
// Method references -> simplify lambda expressions by referring to existing methods.

//import java.util.Arrays;
//import java.util.List;
//
//class MyPrinter{
//    public void print(String str){
//        System.out.println(str);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Adarsh", "Alpana", "Piyush", "Sonali", "Riya");
//
////        list.forEach(s -> System.out.println(s));
//        //Calling a Method inside another Method as a Parameter which is called Method Reference
//        //We can that it is Similar to CALL BY VALUE i.e CALL BY METHOD
//        list.forEach(System.out::println);
//
//    }
//}

// 5. STREAM API

//import java.util.*;
//import java.util.stream.*;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(evenNumbers);
//    }
//}


// 6. Optional Class
//The Optional class helps avoid NullPointerException.

//import java.util.Optional;
//
//public class Main {
//    public static void main(String[] args) {
//        Optional<String> name = Optional.ofNullable(null);
//
//        // Check if value is present
//        System.out.println(name.orElse("Default Name"));
//    }
//}

// 7. New Date & Time API
//Java 8 introduced the java.time package to replace the old Date and Calendar classes.

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.LocalDateTime;
//
//public class Main {
//    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        LocalTime now = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        System.out.println("Today's Date: " + today);
//        System.out.println("Current Time: " + now);
//        System.out.println("Date and Time: " + dateTime);
//    }
//}

