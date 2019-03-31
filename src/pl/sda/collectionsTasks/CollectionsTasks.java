package pl.sda.collectionsTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//static int areaOfCollection ()
//    for (int i = 0; i < circles.size(); i++) {
//        int area = 0;



public class CollectionsTasks {

//    private int countAreaForListOfFigures (List list) {
//        double area = 0;
//        for (int i = 0; i < list.size(); i++) {
//            area += list.get(i).getArea;
//        }
//    }

    public static void main(String[] args) {
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5));
        circles.add(new Circle(6));
        circles.add(new Circle(2));

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(12, 22));
        rectangles.add(new Rectangle(4, 6));

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(12, 22));
        triangles.add(new Triangle(8, 5));
        triangles.add(new Triangle(33, 22));

        int areaCircles = 0;
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(circles.get(i).getArea());
            areaCircles += circles.get(i).getArea();
        }
        System.out.println(areaCircles);

        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(4));
        figures.add(new Rectangle(12, 12));
        figures.add(new Triangle(3,4));





    }
}
