import java.io.File;
import java.io.FileOutputStream;

public class Recording {
    public static void main(String[] args) throws Exception {
        //File file = new File("C:/Javarush/File1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:/Javarush/File2.txt", true);
        String text = "Запиши эту строчку в файл. The END!\r\n";
        fileOutputStream.write(text.getBytes());

        fileOutputStream.close();
        System.out.println("Файл записан");


    }
}
