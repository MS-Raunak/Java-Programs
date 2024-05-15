package DataStructure.nonlinear.hashset;

public class HashSetDriiver {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        System.out.println(hs.add(10));
        System.out.println(hs.add(20));
        System.out.println(hs.add(10));
        System.out.println(hs.add(30));
        hs.remove(30);
        hs.display();
        System.out.println(hs.getSize());
    }
}
