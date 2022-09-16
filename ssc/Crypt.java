import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Crypt {
    String filename;
    String message;
    String keyFilename;
    String key;

    //Läsa in fil
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

    public void crypt(String message, String Key) {
        if(key == null)
        {
            key = readKey(filename);
        }
        encrypt(message, key);
    }


    public String readKey(String KeyFilename) {
        String key = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(keyFilename));
            key = br.readLine();
        } catch (IOException e) {
         e.printStackTrace();
        }
        return key;
    }

    private void encrypt(String message, String key) {
    }
}
