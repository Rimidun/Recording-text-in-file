import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

public class Reading2 {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date();
        File file = new File("C:/Javarush/File2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        int i;
        while((i=fileInputStream.read())!= -1){
            System.out.print((char)i);
        }
        Date date2 = new Date();
        System.out.println(" " + (date2.getTime() - date1.getTime()) + " мильсекунды");

        fileInputStream.close();
    }
}
