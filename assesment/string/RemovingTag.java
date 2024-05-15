package assesment.string;

public class RemovingTag {
    public static void main(String[] args) {
        remove("<h1>Hello World!</h1>");
    }

    private static void remove(String s) {
        boolean flag = true;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '<')
                flag=false;
            else if (s.charAt(i)=='>') {
                flag = true;
                continue;
            }
            if (flag){
                System.out.print(s.charAt(i));
            }
        }
    }
}
