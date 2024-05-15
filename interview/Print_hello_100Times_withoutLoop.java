package interview;

public class Print_hello_100Times_withoutLoop {
    public static void main(String[] args) {
        m(1);
    }

   static void m(int n){
        if (n>100) return;
        System.out.println("Hello" + n);
       m(++n);
    }
}
