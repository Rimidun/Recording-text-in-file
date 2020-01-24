import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class Reading {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date();
        File file = new File("C:/Javarush/File2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 10000);
        int i;
        while ((i = bufferedInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        Date date2 = new Date();
        System.out.println(" " + (date2.getTime() - date1.getTime()) + " мильсекунды");

        fileInputStream.close();
        bufferedInputStream.close();

    }
}
