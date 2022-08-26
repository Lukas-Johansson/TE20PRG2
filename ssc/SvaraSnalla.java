import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class SvaraSnalla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> gienList = Arrays.asList(5, 8, 10);
        Random rnd = new Random();
        int siffra = gienList.get(rnd.nextInt(gienList.size()));
        System.out.println("Tjena hur mår du? ");
        for (int i = 0; i < siffra; i++) {
            String word = input.nextLine();
            List<String> givenList = Arrays.asList("Sant sant", "Kan du utveckla?", "Håller verkligen med", "Aha tror du har någt på tråden här", "Nja tror inte det", "Hur tänkte du här", "Är du verkligen säker på det?");
            Random rand = new Random();
            int randomIndex = rand.nextInt(givenList.size());
            String randomElement = givenList.get(randomIndex);
            String x = randomElement;
            System.out.println(x);
        }
        input.next();
        System.out.println("Nu får du fan dra här ifrån");
    }
}

