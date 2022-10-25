import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Loglayici {
    private FileWriter fw;
    Loglayici(){
        try {
            var dosya = new File("/Users/emirozturk/Desktop/log.txt");
            dosya.createNewFile();
            fw = new FileWriter("/Users/emirozturk/Desktop/log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void logla(String log){
        try {
            fw.write(log+"\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void kapat(){
        try {
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
