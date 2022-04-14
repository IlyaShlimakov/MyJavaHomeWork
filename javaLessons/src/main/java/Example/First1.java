package Example;

import java.util.Scanner;
public class First1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число\n");
        while (!in.hasNextInt()) {
            System.out.println("Вы ввели не число. Повторите");
            in.next();
        }
        int checkNumber = in.nextInt();
        if (checkNumber > 7) {
            System.out.print("Привет\n");

        }
    }
}