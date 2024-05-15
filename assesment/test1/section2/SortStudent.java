package assesment.test1.section2;

import java.util.Arrays;

public class SortStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Chhaya", "Bangalore");
        Student s2 = new Student(2, "Shanaya", "Pakari");
        Student s3 = new Student(3, "Kavya", "Hydrabad");
        Student s4 = new Student(4, "Navya", "Telangana");

        Student[]students = {s1, s2, s3, s4};
        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
