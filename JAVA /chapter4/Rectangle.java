package chapter4;
class Rectangle {
    double length;
    double width;

    void calculateArea() {
        double area = length * width;
        System.out.println("Area: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.width = 3;

        rect.calculateArea();
        rect.calculatePerimeter();
    }
}