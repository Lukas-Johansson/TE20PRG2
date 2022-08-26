import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        List<Integer> givenList = Arrays.asList(5, 8, 10);
        Random rand = new Random();
        int siffra = givenList.get(rand.nextInt(givenList.size()));
    }
}