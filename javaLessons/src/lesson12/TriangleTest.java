package src.lesson12;

public class TriangleTest {
    public static void main(String args[]) {

        int a = 5;
        int b = 6;
        int c = 3 ;
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            int s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Площадь треугольника: " + area);
        } else
            System.out.println("Площаль треугольника неизвестна");
    }
}