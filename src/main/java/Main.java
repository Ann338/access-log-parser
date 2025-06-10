import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;

        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = scanner.nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            if (!fileExists) {
                System.out.println("Файл не найден по этому пути.");
                continue;
            }

            boolean isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Указанный путь ведет к папке, а не к файлу.");
                continue;
            }

            System.out.println("Путь указан верно.");
            x++;
            System.out.println("Это файл номер " + x);
        }
    }
}





/*
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        int sum = firstNumber+secondNumber;
        System.out.println("Сумма: " + sum);
        int diff = firstNumber-secondNumber;
        System.out.println("Разность: " + diff);
        int mult = firstNumber*secondNumber;
        System.out.println("Произведение: " + mult);
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Частное: " + quotient);
 */