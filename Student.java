public class Student {

    private String name;
    private String lName;
    private int age;

    private static Student student;

    private Student(String name, String lName, int age) {
        this.name = name;
        this.lName = lName;
        this.age = age;
    }

    public static Student getSingletonInstance (String name, String lName, int age) {

        if (student == null) {
            student = new Student (name, lName, age);
        } else { 
            System.out.println("Student already exists");
        }

        return student;
    }

    public String toString() {
        return "Name: " + name + " Last Name: " + lName + " Age: " + age;
    }

}