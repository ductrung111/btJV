import java.util.Scanner;
import java.Point;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point(3.5, 7.2);
        Point p3 = new Point("B", 5.0, 10.0);
        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
        Point p4 = new Point();
        p4.input(sc);
        p4.printInfo();
        sc.close();
    }
}