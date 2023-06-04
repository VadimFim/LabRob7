import java.util.Scanner;

public class LabRob516T4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int a = (int) Math.round(Math.random() * 3);
        int b = (int) Math.round(Math.random() * 3);
        int c = (int) Math.round(Math.random() * 3);
        while (count != 2) {
            if (scanner.nextInt() == a && scanner.nextInt() == b && scanner.nextInt() == c) {
                System.out.println("Правильно");
                break;
            } else {
                System.out.println("Неправильно");
                count++;
            }
        }
        System.out.println("Відповідь: " + a + b + c);
    }
}
