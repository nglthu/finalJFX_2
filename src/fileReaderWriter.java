
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class fileReaderWriter {

    public static void main(String[] args) {
        File f = new File("final/src/test.txt");
        //File fw = new File("final/src/writeTest.txt");

        System.out.println(f.getName());
        System.out.println(f.getPath());
        try {
            FileInputStream fis = new FileInputStream(f);
            FileWriter fwa = new FileWriter("writeTest.txt");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.println((char) c);

                // fwa.write((char)c);
                fwa.append((char) c);
                fwa.write(c);

                //fwa.close();
            }
            fwa.close();
            System.out.println("file is written");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
