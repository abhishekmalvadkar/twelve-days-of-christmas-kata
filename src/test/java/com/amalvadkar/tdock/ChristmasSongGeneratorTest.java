package com.amalvadkar.tdock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChristmasSongGeneratorTest {
    @Test
    void should_generate_christmas_song_for_first_day() {
        ChristmasSongGenerator songGenerator = new ChristmasSongGenerator();

        String firstDaySong = songGenerator.generate(ChristmasDay.FIRST);

        assertThat(firstDaySong).isEqualTo("""
                On the first day of Christmas
                My true love gave to me:
                A partridge in a pear tree.""");
    }

    @Test
    void should_generate_christmas_song_for_second_day() {
        ChristmasSongGenerator songGenerator = new ChristmasSongGenerator();

        String secondDaySong = songGenerator.generate(ChristmasDay.SECOND);

        assertThat(secondDaySong).isEqualTo("""
                On the second day of Christmas
                My true love gave to me:
                Two turtle doves and
                A partridge in a pear tree.""");
    }

    @Test
    void should_generate_christmas_song_for_third_day() {
        ChristmasSongGenerator songGenerator = new ChristmasSongGenerator();

        String thirdDaySong = songGenerator.generate(ChristmasDay.THIRD);

        assertThat(thirdDaySong).isEqualTo("""
                On the third day of Christmas
                My true love gave to me:
                Three french hens
                Two turtle doves and
                A partridge in a pear tree.""");
    }
}
