import java.util.Scanner;

public class kryptering2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv något du vill göra haha roligt på? ");
        char m = 'B';
        char k = '(';
        char c = (char)(m^k);
        System.out.println(c);
        System.out.print(c^k);
    }
}
