import java.util.Scanner;

public class greetings2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("S");
        String word = input.nextLine();
        String[] found = word.split( " ");
        System.out.println(found);
        input.close();
    }
}
