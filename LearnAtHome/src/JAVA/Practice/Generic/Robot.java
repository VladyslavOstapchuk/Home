package JAVA.Practice.Generic;

import JAVA.Practice.Generic.Bodies.Body;
import JAVA.Practice.Generic.Heads.Head;

//These extends allow use as parameter T1 or T2
// only Objects which classes extend Head or Body
public class Robot<T1 extends Body, T2 extends Head> {
    private static int amount = 0;

    T1 body;
    T2 head;
    int number;

    public Robot(T1 body, T2 head) {
        this.body = body;
        this.head = head;
        number = ++amount;
    }

    public Robot(Robot robot) {
        this.body = (T1) robot.body;
        this.head = (T2) robot.head;
        number = ++ amount;
    }

    public Robot(){
        body = null;
        head = null;
        number = ++ amount;
    }

    @Override
    public String toString() {
        return "\nRobot" +
                "\n//////////////" +
                "\nNumber : " + number +
                "\nBody   : " + body +
                "\nHead   : " + head;
    }
}
