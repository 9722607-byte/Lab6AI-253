package org.example;

public class Main {
    public static void main(String[] args) {
        // Завдання 1: Animal
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        System.out.println(dog.getName() + " says: " + dog.makeSound());
        System.out.println(cat.getName() + " says: " + cat.makeSound());

        // Завдання 2: Movable
        Point point = new Point(1.0, 2.0);
        point.moveTo(5.0, 10.0);
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");

        // Завдання 3: Smartphone
        Smartphone phone = new Smartphone(46.4825, 30.7233);
        phone.makeCall();
        phone.receiveCall();

        // Завдання 4: Car
        Car car1 = new Car(10000, 2018, 150);
        Car car2 = new Car(10000, 2018, 180);
        System.out.println("Car comparison result: " + car1.compareTo(car2));
    }
}