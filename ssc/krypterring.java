
public class krypterring {
    public static void main(String[] args) {
        int m = 420;
        int k = 4959403;
        int c = m ^ k;
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(c));
        //Decrypter
        System.out.println(c ^ k);
    }
}