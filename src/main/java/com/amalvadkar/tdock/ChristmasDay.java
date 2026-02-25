package com.amalvadkar.tdock;

import lombok.RequiredArgsConstructor;

import java.util.Comparator;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.joining;

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

    public static final Comparator<ChristmasDay> REVERSED_DAY_COMPARATOR = comparing(ChristmasDay::dayNo).reversed();
    public static final String LINE_BREAK = "\n";

    private final int dayNo;
    private final String gift;

    public int dayNo() {
        return dayNo;
    }

    public String gift() {
        return gift;
    }

    public String song(){
        return String.format("""
                %s
                %s""", openingLines(), givenGiftsInDaysReversedOrder());
    }

    private String givenGiftsInDaysReversedOrder() {
        return Stream.of(ChristmasDay.values())
                .filter(this::allPreviousDaysTillToday)
                .sorted(REVERSED_DAY_COMPARATOR)
                .map(ChristmasDay::gift)
                .collect(joining(LINE_BREAK));
    }

    private boolean allPreviousDaysTillToday(ChristmasDay christmasDay) {
        return christmasDay.dayNo <= dayNo;
    }

    private String openingLines() {
        return String.format("""
                On the %s day of Christmas
                My true love gave to me:""", name().toLowerCase());
    }
}
