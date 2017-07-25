package com.example;

import com.example.common.Month;
import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.println(m);
        }
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------------------");
            System.out.println("please pick a month all caps please");
            System.out.printf("\n You have selected : %s\n",Month.valueOf(scanner.nextLine()).getEnglishName());
        }catch (IllegalArgumentException ex){
            System.out.println("Please choose a correct month and use all caps!");
        }
    }
}




