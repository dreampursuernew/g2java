package com.github.dreampursuernew.g2java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.lang.StringTemplate.STR;

public class JavaMain {
    private static void eachListDemo(){
        System.out.println("eachListDemo:");
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(it->{
            System.out.println(it);
        });
    }

    private static void eachMapDemo(){
        System.out.println("eachMapDemo:");

        Map<String, String> map = Map.of("name", "dreampursuernew", "address", "Shanghai");
        map.forEach((key, value)->{
            System.out.println(key + ":" + value);
        });
    }

    private static void stringDemo(){
        System.out.println("stringDemo:");
        var name = "dreampursuernew";
        String str = STR."Hello \{name}";


//        def str = """
//            Hello $name
//            How are you?
//            """
//        println str
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        eachListDemo();
        eachMapDemo();
        stringDemo();
    }
}
