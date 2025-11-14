package Core_Java.Basics;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive types
        int age = 21;
        double price = 99.99;
        char grade = 'A';
        boolean isStudent = true;

        // Non-primitive types
        String name = "Simarpreet";

        // Object example
        Student s1 = new Student("Simarpreet", 21);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Price: " + price);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Student Object: " + s1.name + " (" + s1.age + ")");
    }
}

class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
}