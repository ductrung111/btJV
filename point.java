package java;
import java.util.Scanner;

public class Point {
    private String name;
    private double x;
    private double y;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    public Point() {
        this.name = "A";
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.name = "A";
        this.x = x;
        this.y = y;
    }
    public Point(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public void input(Scanner sc) {
        System.out.print("Nhap ten diem: ");
        this.name = sc.nextLine();
        System.out.print("Nhap hoanh do (x): ");
        this.x = sc.nextDouble();
        System.out.print("Nhap tung do (y): ");
        this.y = sc.nextDouble();
        sc.nextLine();
    }
    public void printInfo() {
        System.out.println(this.name + "(" + this.x + ", " + this.y + ")");
    }
}
