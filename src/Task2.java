import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nusxa ko'chirmoqchi bo'lgan fayl yo'li (path) ni kiriting: ");
        String oldPath = sc.next();
        System.out.println();
        System.out.println("Yangi yaratmoqchi bo'lgan faylingiz yo'li (path) ni kiriting: ");
        String newPath = sc.next();

        File file = new File(oldPath);

        boolean b = file.renameTo(new File(newPath));
        if (b){
            System.out.println("Yangi fayl muvaffaqiyatli yaratildi");
        } else {
            System.out.println("Xatolik yuz berdi");
        }
    }
}
