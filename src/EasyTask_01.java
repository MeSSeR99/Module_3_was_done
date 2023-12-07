import java.util.Scanner;
public class EasyTask_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значения a и b");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

                 int temp = a;
                 a = b;
                 b = temp;

                        System.out.println("Пользователь ввел значение для a: " + a + " и b: " + b );

        }
    }

