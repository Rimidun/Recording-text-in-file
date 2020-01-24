import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Date;

public class Reading3 {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date();
        //File file = new File();
        PrintStream filePrintStream = new PrintStream("C:/Javarush/File5.txt");
        //BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        filePrintStream.println("Строчка 1");
        filePrintStream.println("Строчка 2");
        filePrintStream.println("Строчка 3");
        filePrintStream.println("Строчка 4");

        Date date2 = new Date();
        System.out.println(" " + (date2.getTime() - date1.getTime()) + " мильсекунды");

        filePrintStream.close();
    }
}
