package Example;
import java.util.Scanner;
public class First2 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя\n");
        String checkName = in.nextLine();
        String comparingName = "Вячеслав";
        if (checkName.equalsIgnoreCase(comparingName)) {
            System.out.print("Привет, Вячеслав\n");
        } else {
            System.out.print("Нет такого имени\n");
        }
    }
}