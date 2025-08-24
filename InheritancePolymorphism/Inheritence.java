package inheritence;
// Part 8: Inheritance & Polymorphism Examples
public class Inheritence {
    public static void main(String[] args) {

        // 1. Single inheritance
        DogSingle dog = new DogSingle();
        dog.eat();
        dog.bark();

        // 2. Hierarchical inheritance
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        // 3. Abstract class and abstract method
        ShapeAbstract circle = new CircleAbstract(5);
        System.out.println("Area of circle: " + circle.area());

        // 4. Multiple inheritance using interfaces
        MultiFunctionDevice device = new MultiFunctionDevice();
        device.print();
        device.scan();

        // 5. Dynamic method dispatch
        AnimalPoly animal = new DogPoly();
        animal.makeSound(); // calls overridden method in DogPoly
    }
}

// 1. Single inheritance
class AnimalSingle {
    void eat() {
        System.out.println("Animal eats");
    }
}

class DogSingle extends AnimalSingle {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 2. Hierarchical inheritance
class Cat extends AnimalSingle {
    void meow() {
        System.out.println("Cat meows");
    }
}

// 3. Abstract class and abstract method
abstract class ShapeAbstract {
    abstract double area();
}

class CircleAbstract extends ShapeAbstract {
    double radius;
    CircleAbstract(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// 4. Multiple inheritance using interfaces
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionDevice implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

// 5. Dynamic method dispatch
class AnimalPoly {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class DogPoly extends AnimalPoly {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

