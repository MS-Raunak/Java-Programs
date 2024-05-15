package DataStructure.Array.objectsorting.comparable;

//Using Comparable we can sort objects based on single attributes
public class Student implements Comparable {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + age + "]";
    }

    @Override
    public int compareTo(Object obj) {
        Student s = (Student) obj;
        //Sort Base on id
        /*
        if (this.id > s.id) return 1;
        else if (this.id < s.id) return -1;
        else return 0;
         */

        //Sort Base on name
        /*
        if (this.name.charAt(0) > s.name.charAt(0)) return 1;
        else if (this.name.charAt(0) < s.name.charAt(0)) return -1;
        else return 0;
         */

        //Sort Based on age
        if (this.age > s.age) return 1;
        else if (this.age< s.age) return -1;
        else return 0;

    }
}
