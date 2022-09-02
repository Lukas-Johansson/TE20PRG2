import java.util.Scanner;

public class kryptering2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv det du vill få haha roligt på");
        String word = input.nextLine();
        char l = (char) word.length();
        char o=word.charAt(0);
        char m = o;
        char k = '(';
        char c = (char)(m^k);
        System.out.println(c);
        System.out.print((char) (c^k));
        System.out.print(l);
    }
}
