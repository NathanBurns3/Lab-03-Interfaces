import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {

    public static void main(String[] args) {
        ArrayList<Object> rectangles = new ArrayList<Object>();

        rectangles.add(new Rectangle(1,1));
        rectangles.add(new Rectangle(2,1));
        rectangles.add(new Rectangle(1,2));
        rectangles.add(new Rectangle(3,1));
        rectangles.add(new Rectangle(6,6));
        rectangles.add(new Rectangle(7,7));
        rectangles.add(new Rectangle(3,3));
        rectangles.add(new Rectangle(5,5));
        rectangles.add(new Rectangle(8,8));
        rectangles.add(new Rectangle(10,10));

        rectangles = BigRectangleFilter.collectAll(rectangles, new BigRectangleFilter());

        System.out.println("Rectangles from the array list: ");
        for (Object x : rectangles) {
            System.out.println(x);
        }
    }
}
