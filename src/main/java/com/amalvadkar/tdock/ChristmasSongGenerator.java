package com.amalvadkar.tdock;

public class ChristmasSongGenerator {

    public String generate(ChristmasDay christmasDay) {
        if (christmasDay.isSecond()) {
            return """
                    On the second day of Christmas
                    My true love gave to me:
                    Two turtle doves and
                    A partridge in a pear tree.""";
        }
        return """
                On the first day of Christmas
                My true love gave to me:
                A partridge in a pear tree.""";
    }

}
