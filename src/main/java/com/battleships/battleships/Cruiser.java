package com.battleships.battleships;

import org.springframework.stereotype.Component;

@Component
public class Cruiser extends BattleshipSquare{

    private final String type = "Cruiser";
    private String state = "3";
    private final int space = 3;
    private int spaceCount = 3;

    public String getType() {
        return type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSpace() {
        return space;
    }

    public int getSpaceCount() {
        return spaceCount;
    }

    public void minusOneSpaceCount() {
        this.spaceCount -= 1;
    }
}
