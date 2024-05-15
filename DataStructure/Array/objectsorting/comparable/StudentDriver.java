package DataStructure.Array.objectsorting.comparable;


import java.util.Arrays;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Chhaya", 3);
        Student s2 = new Student(2, "Shanaya", 2);
        Student s3 = new Student(3, "Kavya", 32);
       Student s4 = new Student(4, "Navya", 22);

        Student[]students = {s1, s2, s3, s4};
        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
