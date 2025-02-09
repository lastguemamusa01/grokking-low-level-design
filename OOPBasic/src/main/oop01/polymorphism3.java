class Area {
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(double side) {
        return side * side;
    }
}

public class main {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.print("Area of rectangle = " + area.calculateArea(3, 4));
        System.out.print("\n");
        System.out.print("Area of square = " + area.calculateArea(6));
    }
}