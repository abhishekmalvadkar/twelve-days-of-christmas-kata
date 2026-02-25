# Twelve Days of Christmas Kata

[![CI with Qodana](https://github.com/abhishekmalvadkar/twelve-days-of-christmas-kata/actions/workflows/all-tests.yml/badge.svg)](https://github.com/abhishekmalvadkar/twelve-days-of-christmas-kata/actions/workflows/all-tests.yml)

## Overview

This kata requires writing the smallest program that outputs the lyrics of the Christmas carol  
**“The Twelve Days of Christmas”**.

The focus of this kata is **behavior-driven development (BDD)** and **test-driven development (TDD)**:
- Describe the expected behavior using examples
- Implement the solution incrementally
- Refactor safely as behavior remains unchanged

---

## Feature: Generate the Twelve Days of Christmas Song

The Christmas song consists of 12 verses.
Each verse represents a day of Christmas and follows a clear set of rules.

### Business Rules

1. The song has exactly **12 days**
2. Each day introduces **one new gift**
3. Each verse repeats **all previous gifts**
4. Gifts are listed in **reverse order** (newest first)
5. From the second day onward:
   - The final gift is prefixed with **"and"**
6. On the first day:
   - There is only one gift
   - The word **"and"** is not used

---

## Scenario 1: Singing the song on the first day

**Given** it is the first day of Christmas  
**When** I sing the Christmas song  
**Then** the verse should start with:
  - On the first day of Christmas
  - My true love gave to me:  
**And** the verse should contain exactly one gift:
  - A partridge in a pear tree.


---

## Scenario 2: Singing the song on the second day

**Given** it is the second day of Christmas  
**When** I sing the Christmas song  
**Then** the verse should contain two gifts  
**And** the gifts should be listed in this order:
  - Two turtle doves
  - and A partridge in a pear tree.


---

## Scenario 3: Singing the song on the third day

**Given** it is the third day of Christmas  
**When** I sing the Christmas song  
**Then** the verse should contain three gifts  
**And** the gifts should be listed in descending order:
  - Three french hens
  - Two turtle doves
  - and A partridge in a pear tree.


---

## Scenario 4: Singing the song on the fifth day

**Given** it is the fifth day of Christmas  
**When** I sing the Christmas song  
**Then** the verse should contain the following gifts:
  - Five golden rings
  - Four calling birds
  - Three french hens
  - Two turtle doves
  - and A partridge in a pear tree.


---

## Scenario 5: Singing the song on the twelfth day

**Given** it is the twelfth day of Christmas  
**When** I sing the Christmas song  
**Then** the verse should contain twelve gifts  
**And** the first gift should be:
  - Twelve drummers drumming  
**And** the final gift should be:
  - and A partridge in a pear tree.


---

## Scenario 6: Singing the full song

**Given** I want to sing the entire Twelve Days of Christmas song  
**When** I generate the full song  
**Then** the song should contain 12 verses  
**And** the verses should be ordered from the first day to the twelfth day  
**And** each verse should be separated by a blank line

---

## Resources

The lyrics can be found [Here](https://www.lyricsmode.com/lyrics/c/christmas_carols/the_twelve_days_of_christmas.html)




