
public class main {

    public static void main(String[] args) {
        
        Student b = Student.getSingletonInstance("John", "Doe", 25);
        System.out.println(b.toString());

    }
}