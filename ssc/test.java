import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test {
        public static String makeStringsEqual(String str, String keyword) {
            String ret = "";
            int ci     = 0;

            if (str.length() > keyword.length()) {
                for(int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' ') {
                        if (ci == keyword.length()) {
                            ci = 0;
                        }
                        ret += keyword.charAt(ci);
                        ci++;
                    } else {
                        ret += " ";
                    }
                }
            }

            return ret;
        }
        public static void main(String[] args) {
            System.out.println(makeStringsEqual("hello my", "test"));
        }
}