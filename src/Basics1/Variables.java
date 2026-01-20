package Basics1;

public class Variables {
    public static void main(String[] args) {
        int age = 22;
        int Age = 18;
        int marks = 98;

        int secondSubjectMarks = 57; // CamelCasing
        // Only special character allowed in naming convention are _ and $.
        String allowed_Character$ = ("Allowed Character");

        // Keywords can't be used for naming convention.
        // int static = 12; not allowed

        System.out.println(age);
        System.out.println(Age);
        System.out.println(marks);
        System.out.println(secondSubjectMarks);
        System.out.println(allowed_Character$);
    }
}
