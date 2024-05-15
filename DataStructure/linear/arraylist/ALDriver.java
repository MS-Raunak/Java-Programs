package DataStructure.linear.arraylist;

public class ALDriver {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.addElement(10);
        arrayList.addElement(20);
        arrayList.addElement(30);
        arrayList.addElement(30);
        arrayList.addElement(30);

        System.out.println(arrayList.size());
        arrayList.display();
        System.out.println("\n"+ arrayList.getElement(3));
    }
}
