package br.com.gpmendes7.generics4.application;

import br.com.gpmendes7.generics4.entities.Circle;
import br.com.gpmendes7.generics4.entities.Rectangle;
import br.com.gpmendes7.generics4.entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for(Shape s: list) {
            sum += s.area();
        }
        return sum;
    }

}
