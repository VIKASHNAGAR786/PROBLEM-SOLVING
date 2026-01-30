import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a chararter");
        char c = sc.next().charAt(0);

        if  (c == 'a' || c == 'A') {
            System.out.println("is vowel");
        }
        else if (c == 'e' || c == 'E') {
            System.out.println("is vowel");
        }
        else if (c == 'i' || c == 'I') {
            System.out.println("is vowel");
        }
        else if (c == 'o' || c == 'O') {
            System.out.println("is vowel");
        }
        else if (c == 'u' || c == 'U') {
            System.out.println("is vowel");
        }
        else{
            System.out.println("not vowel");
        }
        
    }
}
