package chapter4;
class Car {
    String brand;
    String model;
    int price;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.price = 20000;

        Car car2 = new Car();
        car2.brand = "Honda";
        car2.model = "Civic";
        car2.price = 22000;

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " - $" + car1.price);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " - $" + car2.price);
    }
}