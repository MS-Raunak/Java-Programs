package assesment.test1.section2;

//Sort Student Object based on adress
public class Student implements Comparable{
    int id;
    String name;
    String address;

    public Student(int id, String name, String address){
        this.id = id;
        this.name=name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + address + "]";
    }

    @Override
    public int compareTo(Object obj) {
        Student s = (Student) obj;
        if (this.address.charAt(0)  > s.address.charAt(0)) return 1;
        else if (this.address.charAt(0) < s.address.charAt(0)) return -1;
        else return 0;
    }

}

