package com.asjaHas.qamp.oophomework2.task2;

public class RobotMain {
    public static void main(String[] args) {

        Robot robot1 = new Robot(1, 4);
        Robot robot2 = new Robot(0, 0);


        System.out.println(robot1.getPosition().x + ", " + robot1.getPosition().y);
        robot1.moveNorth();
        robot1.moveEast();
        System.out.println(robot1.getPosition().x + ", " + robot1.getPosition().y);

        robot1.printLastPosition();
        System.out.println("The euclidean distance from the initial position is: " + robot1.getDistance());

    }
}
