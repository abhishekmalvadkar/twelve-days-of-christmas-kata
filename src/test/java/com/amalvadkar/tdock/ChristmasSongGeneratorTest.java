package com.amalvadkar.tdock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ChristmasSongGeneratorTest {

    private final ChristmasSongGenerator songGenerator = new ChristmasSongGenerator();

    @ParameterizedTest
    @MethodSource("daysWithExpectedSongs")
    void should_generate_christmas_song(ChristmasDay day, String expectedSong) {
        String generatedSong = songGenerator.generate(day);

        assertThat(generatedSong).isEqualTo(expectedSong);
    }

    private static Stream<Arguments> daysWithExpectedSongs() {
        return Stream.of(
                Arguments.of(ChristmasDay.FIRST, """
                        On the first day of Christmas
                        My true love gave to me:
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.SECOND, """
                        On the second day of Christmas
                        My true love gave to me:
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.THIRD, """
                        On the third day of Christmas
                        My true love gave to me:
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.FORTH, """
                        On the forth day of Christmas
                        My true love gave to me:
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.FIFTH, """
                        On the fifth day of Christmas
                        My true love gave to me:
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.SIXTH, """
                        On the sixth day of Christmas
                        My true love gave to me:
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.SEVENTH, """
                        On the seventh day of Christmas
                        My true love gave to me:
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.EIGHT, """
                        On the eight day of Christmas
                        My true love gave to me:
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.NINTH, """
                        On the ninth day of Christmas
                        My true love gave to me:
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.TENTH, """
                        On the tenth day of Christmas
                        My true love gave to me:
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.ELEVENTH, """
                        On the eleventh day of Christmas
                        My true love gave to me:
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree."""),
                Arguments.of(ChristmasDay.TWELFTH, """
                        On the twelfth day of Christmas
                        My true love gave to me:
                        Twelve drummers drumming
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves and
                        A partridge in a pear tree.""")
        );
    }
}
