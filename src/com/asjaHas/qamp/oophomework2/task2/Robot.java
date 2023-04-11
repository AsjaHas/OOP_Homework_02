package com.asjaHas.qamp.oophomework2.task2;


import java.util.ArrayList;

public class Robot {
    Positions position;
    int moves;

    public Robot() {
        this.position = new Positions(0, 0);
        this.moves = 0;
    }

    public Robot(int x, int y) {
        this.position = new Positions(x, y);
        this.moves = 0;
    }

    public void moveSouth() {
        this.position.setPosition(this.position.x, this.position.y - 1);
        this.moves++;
    }

    public void moveNorth() {
        this.position.setPosition(this.position.x, this.position.y + 1);
        this.moves++;
    }

    public void moveEast() {
        this.position.setPosition(this.position.x + 1, this.position.y);
        this.moves++;
    }

    public void moveWest() {
        this.position.setPosition(this.position.x - 1, this.position.y);
        this.moves++;
    }

    public Positions getPosition() {
        return this.position;
    }

    public double getDistance() {
        int x0 = this.position.getPositionHistory().get(0)[0];
        int y0 = this.position.getPositionHistory().get(0)[1];
        int x = this.position.x;
        int y = this.position.y;
        return Math.sqrt(((x0 - x) * (x0 - x)) + ((y0 - y) * (y0 - y)));
    }

    public int getMoves() {
        return this.moves;
    }

    public void printLastPosition() {
        ArrayList<int[]> positionHistory = this.position.getPositionHistory();
        for (int i = positionHistory.size() - 1; i >= 0; i--) {
            System.out.println("(" + positionHistory.get(i)[0] + ", " + positionHistory.get(i)[1] + ")");
        }
    }
}
