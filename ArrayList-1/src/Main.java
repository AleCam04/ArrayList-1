import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 23));
        students.add(new Student("Diana", 21));


        for(Student student : students){
            System.out.println(student);
        }
    }
}