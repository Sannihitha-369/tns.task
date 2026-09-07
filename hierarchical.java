class Food {
    void showFood() {
        System.out.println("This is food");
    }
}

class Pizza extends Food {
    void showPizza() {
        System.out.println("This is pizza");
    }
}

class Burger extends Food {
    void showBurger() {
        System.out.println("This is burger");
    }
}

public class FoodDemo {
    public static void main(String[] args) {

        Pizza p = new Pizza();

        p.showFood();
        p.showPizza();

        Burger b = new Burger();

        b.showFood();
        b.showBurger();
    }
}