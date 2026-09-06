class Student {
  Student() {
    this(20);
    System.out.println("Default constructor");
  }

  Student(int age) {
    System.out.println("Age: " + age);
  }

  public static void main(String[] args) {
    Student s = new Student();
  }
}