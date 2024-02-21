import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        //Faylga yozilgan 2 ta son yig'indisini boshqasiga yozish

        yigindiniFaylgaYozish();
    }

    private static void yigindiniFaylgaYozish() {

        InputStream in = null;
        try {
            in = new FileInputStream("text.txt");

            Scanner sc = new Scanner(in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = a + b;

            OutputStream out = null;
            out = new FileOutputStream("natija.txt");
            try {
                out.write((c + " ").getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
