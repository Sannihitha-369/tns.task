class Employee {
    void showEmployee() {
        System.out.println("I am an employee");
    }
}

class Developer extends Employee {
    void showDeveloper() {
        System.out.println("I am a developer");
    }
}

class SeniorDeveloper extends Developer {
    void showSeniorDeveloper() {
        System.out.println("I am a senior developer");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        SeniorDeveloper s = new SeniorDeveloper();

        s.showEmployee();
        s.showDeveloper();
        s.showSeniorDeveloper();
    }
}