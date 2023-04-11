package com.asjaHas.qamp.oophomework2.task2;

import java.util.ArrayList;

public class Positions {
    int x;
    int y;
    ArrayList<int[]> positionHistory;

    public Positions(int x, int y) {
        this.x = x;
        this.y = y;
        this.positionHistory = new ArrayList<>();
        this.positionHistory.add(new int[]{x, y});
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        this.positionHistory.add(new int[]{x, y});
    }

    public ArrayList<int[]> getPositionHistory() {
        return this.positionHistory;
    }
}
