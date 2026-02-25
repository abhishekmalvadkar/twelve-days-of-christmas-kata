package com.amalvadkar.tdock;

import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public enum ChristmasDay {
    FIRST(1, "A partridge in a pear tree."),
    SECOND(2, "Two turtle doves and"),
    THIRD(3, "Three french hens"),
    FORTH(4, "Four calling birds"),
    FIFTH(5, "Five golden rings"),
    SIXTH(6, "Six geese a-laying"),
    SEVENTH(7, "Seven swans a-swimming"),
    EIGHT(8, "Eight maids a-milking"),
    NINTH(9, "Nine ladies dancing"),
    TENTH(10, "Ten lords a-leaping"),
    ELEVENTH(11, "Eleven pipers piping"),
    TWELFTH(12, "Twelve drummers drumming");

    private final int dayNo;
    private final String gift;

    public boolean isSecond() {
        return SECOND == this;
    }

    public boolean isThird() {
        return THIRD == this;
    }

    public int dayNo() {
        return dayNo;
    }

    public String gift() {
        return gift;
    }

    public String song(){
        String openingLines = String.format("""
                On the %s day of Christmas
                My true love gave to me:""", name().toLowerCase());
        String givenGiftsInDaysReversedOrder = Stream.of(ChristmasDay.values())
                .filter(christmasDay -> christmasDay.dayNo <= dayNo)
                .sorted(Comparator.comparing(ChristmasDay::dayNo).reversed())
                .map(ChristmasDay::gift)
                .collect(Collectors.joining("\n"));
        return String.format("""
                %s
                %s""", openingLines, givenGiftsInDaysReversedOrder);
    }
}
