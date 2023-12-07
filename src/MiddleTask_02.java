import java.util.Scanner;
    public class MiddleTask_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                 System.out.println("Введите значение a");
                 int a = scanner.nextInt();
                 System.out.println("Введите значение b");
                 int b = scanner.nextInt();
                 System.out.println("Введите значение c");
                 int c = scanner.nextInt();
                 int result = b * b - 4 * a * c;

            System.out.println("Дискриминант равен: " + result);
        }
    }

