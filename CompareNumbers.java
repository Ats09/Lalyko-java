import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите первое целое число:");
        int a = scanner.nextInt();
        
        System.out.println("Введите второе целое число:");
        int b = scanner.nextInt();
        
        System.out.println("Результат сравнения:");
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        System.out.println("Результаты арифметических операций:");
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        System.out.println("Произведение: " + (a * b));
        if (b != 0) {
            System.out.println("Частное: " + ((double) a / b));
        } else {
            System.out.println("Деление на 0 невозможно");
        }
    }
}
