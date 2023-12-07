import java.util.Scanner;
public class MiddleTask_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

             System.out.println("Введите количство рабочих дней");
             int a = scanner.nextInt();

                 System.out.println("Введите з/п за рабочий день");
                float b = scanner.nextFloat();

                    float zp = a * b;

                        System.out.println("Заработная плата: " + zp);

    }
}
