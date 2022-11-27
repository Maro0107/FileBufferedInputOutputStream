import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBufferedOutputStream {
    public static void main(String[] args)throws IOException {

        BufferedOutputStream out = null;
        String str = "example string";
        char chars[] = str.toCharArray();


        try {
            out = new BufferedOutputStream(new FileOutputStream("files\\fileWrite.txt"));

            for (char c:chars) {
                out.write(c);
            }


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (out != null) out.close();
        }
    }
}
