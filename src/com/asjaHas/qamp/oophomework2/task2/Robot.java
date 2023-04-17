package com.asjaHas.qamp.oophomework2.task2;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private List<Position> positionList;

    public Robot() {
        this.positionList = new ArrayList<>();
        positionList.add(new Position(0, 0));
    }

    public Robot(int x, int y) {
        this.positionList = new ArrayList<>();
        positionList.add(new Position(x, y));
    }

    public void moveSouth() {
        Position currentPosition = positionList.get(positionList.size() - 1);
        Position newPosition = new Position(currentPosition.getX(), currentPosition.getY() - 1);
        positionList.add(newPosition);
    }

    public void moveNorth() {
        Position currentPosition = positionList.get(positionList.size() - 1);
        Position newPosition = new Position(currentPosition.getX(), currentPosition.getY() + 1);
        positionList.add(newPosition);
    }

    public void moveEast() {
        Position currentPosition = positionList.get(positionList.size() - 1);
        Position newPosition = new Position(currentPosition.getX() + 1, currentPosition.getY());
        positionList.add(newPosition);
    }

    public void moveWest() {
        Position currentPosition = positionList.get(positionList.size() - 1);
        Position newPosition = new Position(currentPosition.getX() - 1, currentPosition.getY());
        positionList.add(newPosition);
    }

    public Position getPosition() {
        return positionList.get(positionList.size() - 1);
    }


    public double getDistance() {
        int x0 = positionList.get(0).getX();
        int y0 = positionList.get(0).getY();
        int x = positionList.get(positionList.size() - 1).getX();
        int y = positionList.get(positionList.size() - 1).getY();
        return Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
    }

    public int getMoves() {
        return positionList.size() - 1;
    }

    public void printLastPosition(int n) {
        int startIndex;
        if (n >= positionList.size()) {
            startIndex = 0;
        } else {
            startIndex = positionList.size() - n;
        }
        for (int i = positionList.size() - 1; i >= startIndex; i--) {
            Position p = this.positionList.get(i);
            System.out.println("(" + p.getX() + ", " + p.getY() + ")");
        }
    }
}
