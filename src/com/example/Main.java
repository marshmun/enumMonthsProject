package com.example;

import com.example.common.Month;
import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (Month m : Month.values()) {
            System.out.println(m);
        }
        System.out.println("------------------");
        System.out.println("please pick a month all caps please");
        try {
            Month month = Month.valueOf(scanner.nextLine());
            System.out.printf("\n You have selected : %s\n", month.getEnglishName());
            List <String> getEng = new ArrayList<>();
        switch ( month ) {
            case JANUARY:
                getEng.add("January");
            case FEBUARY:
                getEng.add("February");
            case MARCH:
                getEng.add("March");
            case APRIL:
                getEng.add("April");
            case MAY:
                getEng.add("May");
            case JUNE:
                getEng.add("June");
            case JULY:
                getEng.add("July");
            case AUGUST:
                getEng.add("August");
            case SEPTEMBER:
                getEng.add("September");
            case OCTOBER:
                getEng.add("October");
            case NOVEMEBER:
                getEng.add("November");
            case DECEMBER:
                getEng.add("December");
                System.out.println(getEng);

        }
        } catch (IllegalArgumentException ex) {
            System.out.println("Please choose a correct month and use all caps!");
            System.exit(-1);
        }

    }

}




