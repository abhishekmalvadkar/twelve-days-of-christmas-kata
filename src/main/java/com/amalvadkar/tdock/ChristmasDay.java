package com.amalvadkar.tdock;

public enum ChristmasDay {
    FIRST,
    SECOND,
    THIRD;

    public boolean isSecond() {
        return SECOND == this;
    }

    public boolean isThird() {
        return THIRD == this;
    }
}
