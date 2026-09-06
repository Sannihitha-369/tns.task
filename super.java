class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();  // calls parent class constructor
    }

    void display() {
        System.out.println(super.name);  // calls parent class variable

        super.sound();  // calls parent class method

        System.out.println(name);  // child class variable
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}