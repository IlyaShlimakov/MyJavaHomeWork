package Example;

import java.util.Scanner;

public class First3 {
    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите числа через пробел\n");
        String checkStr = in.nextLine();
        String strArr[] = checkStr.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].matches("[-+]?\\d+")) {
                numArr[i] = Integer.parseInt(strArr[i]);
                if (numArr[i] % 3 == 0) {
                    System.out.println(numArr[i]);
                }
            }
        }
    }
}
