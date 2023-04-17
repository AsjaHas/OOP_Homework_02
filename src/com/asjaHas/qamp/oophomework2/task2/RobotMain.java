package com.asjaHas.qamp.oophomework2.task2;

public class RobotMain {
    public static void main(String[] args) {

        Robot robot1 = new Robot(1, 4);
        Robot robot2 = new Robot(0, 0);

        robot1.printLastPosition(1);
        robot2.printLastPosition(1);

        robot1.moveNorth();
        robot1.moveEast();

        System.out.println("The number of moves the robot has performed is: " + robot1.getMoves());
        robot1.printLastPosition(5);

        System.out.println("The euclidean distance from the initial position is: " + robot1.getDistance());

    }
}
