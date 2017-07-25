package com.example.common;

public enum Month {
    JANUARY("January"),
    FEBUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("Sepetember"),
    OCTOBER("October"),
    NOVEMEBER("November"),
    DECEMBER("December");

    public String englishName;

    Month(String englishName) {
        this.englishName = englishName;

    }
    public String getEnglishName(){
        return englishName;
    }
}
