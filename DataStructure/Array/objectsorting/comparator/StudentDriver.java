package DataStructure.Array.objectsorting.comparator;



import java.util.Arrays;
import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
      Student s1 = new Student(1, "Chhaya", 3);
      Student s2 = new Student(2, "Shanaya", 2);
      Student s3 = new Student(3, "Kavya", 32);
      Student s4 = new Student(4, "Navya", 22);

      Student[]students = {s1, s2, s3, s4};

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sort By Id\n2.Sort By Name\n3.Sort By Age\nEnter your choice: ");
        int ch = sc.nextInt();

        switch (ch){
            case 1: {
                Arrays.sort(students, new SortById());
                for (Student s: students) System.out.println(s);
            }break;
            case 2: {
                Arrays.sort(students, new SortByName());
                for (Student s: students) System.out.println(s);
            } break;
            case 3: {
                Arrays.sort(students, new SortByAge());
                for (Student s: students) System.out.println(s);
            } break;
            default:
                System.out.println("Please enter valid choice");

        }
    }
}
