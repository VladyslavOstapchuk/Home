package JAVA.Practice.AbstractClasses;

import JAVA.Practice.AbstractClasses.Shapes.Cube;
import JAVA.Practice.AbstractClasses.Shapes.Shape2D;
import JAVA.Practice.AbstractClasses.Shapes.Square;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Shape2D> shapes = new LinkedList<>();

        shapes.add(new Cube(12,"Green"));
        shapes.add(new Square(12,"Yellow"));

//        printShapes(shapes);
        printShapesByForEach(shapes);
    }

    public static void printShapes(LinkedList<Shape2D> shapes){
        Iterator iterator = shapes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void printShapesByForEach(LinkedList<Shape2D> shapes){
        for(Shape2D shape : shapes){
            System.out.println(shape);
        }
    }
}
