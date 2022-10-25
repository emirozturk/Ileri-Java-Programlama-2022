import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SLoglayici {
    private FileWriter fw;
    private static SLoglayici sLoglayici;

    static SLoglayici ornekAl(){
        if(sLoglayici==null){
            sLoglayici = new SLoglayici();
        }
        return sLoglayici;
    }

    private SLoglayici(){
        try {
            var dosya = new File("/Users/emirozturk/Desktop/slog.txt");
            dosya.createNewFile();
            fw = new FileWriter("/Users/emirozturk/Desktop/slog.txt");
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
