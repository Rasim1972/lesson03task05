import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("1:" + total);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("3:" + scanner);             // печать

            System.out.println("Вводите путь к файлу: ");   // печать

            String path = new Scanner(System.in).nextLine();
            System.out.println("4:" + path);                // печать

            File file = new File(path);
            System.out.println("5:" + file);                // печать

            boolean fileExists = file.exists();
            System.out.println("6:" + fileExists);          // печать

            boolean isDirectory = file.isDirectory();
            System.out.println("7:" + isDirectory);         // печать

            if(!fileExists || file.isDirectory()) {
                System.out.println("Это путь к папке или пути к несуществующему файлу");
                continue;
                }
            total++;
            System.out.println("Путь указан верно. Это файл номер N: " + total);
        }
    }
}