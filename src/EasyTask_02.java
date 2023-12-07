import java.util.Scanner;
public class EasyTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

             System.out.println("Введите первое число");
             float a = scanner.nextFloat();
             System.out.println("Введите второе число");
             float b = scanner.nextFloat();
             System.out.println("Введите третье число");
             float c = scanner.nextFloat();
                    float sum = a + b + c;
                    float pr = a * b * c;
                 System.out.println("Сумма: " + sum);
                 System.out.println("Произведение: " + pr);



    }
}
