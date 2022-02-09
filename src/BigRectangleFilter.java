import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectangleFilter implements Filter{
    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle) {
            Rectangle r = (Rectangle) x;
            return ((2 * r.height) + (2 * r.width)) > 10;
        }
        return false;
    }

    public static ArrayList<Object> collectAll(ArrayList<Object> objects, Filter w) {
        ArrayList<Object> obj = new ArrayList<Object>();

        for (Object x : objects) {
            if (w.accept(x)) {
                obj.add(x);
            }
        }
        return obj;
    }
}
