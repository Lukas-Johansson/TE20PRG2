import java.io.BufferedReader;
import  java.io.FileReader;
import java.io.IOException;

public class Crypt {
    String filename;
    String message;
    String keyFilename;
    String key;

    public String readFile(String filename)
    {
        String msg = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            msg = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return msg;
    }

    public void crypt(String message, String key)
    {
        if(key == null)
        {
            key = readKey(filename);
        }
        encrypt(message, key);
    }

    public String readKey(String keyFilename) {
        String key = "";

    }

    private void encrypt(String message, String key) {

    }
}
