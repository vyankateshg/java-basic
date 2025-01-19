// Class and Abstraction
abstract class Animal {
    private String name; // Encapsulation

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { // Encapsulation: Getter
        return name;
    }

    public abstract void sound(); // Abstraction: Abstract method
}

// Inheritance and Polymorphism
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() { // Polymorphism: Method overriding
        System.out.println(getName() + " says Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() { // Polymorphism: Method overriding
        System.out.println(getName() + " says Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy"); // Object creation
        Animal cat = new Cat("Kitty");

        dog.sound(); // Polymorphism in action
        cat.sound(); // Polymorphism in action
    }
}
