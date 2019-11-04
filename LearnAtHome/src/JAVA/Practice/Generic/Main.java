package JAVA.Practice.Generic;

import JAVA.Practice.Generic.Bodies.Body;
import JAVA.Practice.Generic.Bodies.Body1;
import JAVA.Practice.Generic.Bodies.Body2;
import JAVA.Practice.Generic.Heads.Head;
import JAVA.Practice.Generic.Heads.Head1;
import JAVA.Practice.Generic.Heads.Head2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Head[] heads = {new Head1("Head1"), new Head2("Head2")};
        Body[] bodies = {new Body1("Body1"), new Body2("Body2")};

        LinkedList<Robot> robots = new LinkedList<>();

        for (int i = 0; i < 10; i++)
            robots.add(new Robot(bodies[(int)(Math.random()*2)],heads[(int)(Math.random()*2)]));

        //These objects use class Object as parameter T1

        Robot robot11 = new Robot();
        Robot robot12 = robot11;
        Robot robot13 = new Robot(robot11);
        Robot <Body2,Head2>robot14 = new Robot(new Body2("Body2"),new Head2("Head2"));

        //

        robots.add(robot11);
        robots.add(robot12);
        robots.add(robot13);
        robots.add(robot14);

        //
        showCollection(robots);

    }

    public static void showCollection(Collection collection){
        Iterator iterator = collection.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //Parameter method 1
    public <T1,T2> void foo1(){
        //write your code here
    }

    //Parameter method 2
    public void foo2(Robot<?,?> robot){
        //write your code here
    }
}
