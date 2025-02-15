import java.net.SocketOption;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rectangle {
    private int length, width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + length;
        result = prime * result + width;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        if (length != other.length) {
            return false;
        }
        if (width != other.width) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r1.equals(r2));
//        List<Rectangle> list = new ArrayList<Rectangle>();
//        list.add(r1);
//        System.out.println(list.contains(r2));
        Set<Rectangle> set = new HashSet<Rectangle>();
        set.add(r1);
        System.out.println(set.contains(r2));
    }
}
