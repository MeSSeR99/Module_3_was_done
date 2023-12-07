
import java.util.Scanner;
            public class HardTask_02 {
                public static void main(String[] args) {

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введите координаты вершин треугольника:");
                    double x1 = scanner.nextDouble();
                    double y1 = scanner.nextDouble();
                    double x2 = scanner.nextDouble();
                    double y2 = scanner.nextDouble();
                    double x3 = scanner.nextDouble();
                    double y3 = scanner.nextDouble();

                        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
                        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

                            double per = (side1 + side2 + side3) / 2;

                                // Вычисление площади треугольника по формуле Герона
                                double area = Math.sqrt(per * (per - side1) *
                                (per - side2) * (per - side3));

                                System.out.println("Площадь треугольника: " + area);
                }
            }