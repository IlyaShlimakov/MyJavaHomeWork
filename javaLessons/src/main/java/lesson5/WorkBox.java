package lesson5;

import org.lesson5.Apple;
import org.lesson5.Box;
import org.lesson5.Orange;

public class WorkBox {
    public static void main(String[] args) {
        Box bigBox = new Box();
        Box littleBox = new Box();
        Box veryBigBox = new Box();
        Box smallBox = new Box();

        for (int i = 0; i < 0 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                bigBox.addFruitToBox(new Apple());
            } else bigBox.addFruitToBox(new Orange());
        }

        for (int i = 0; i < 10 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                littleBox.addFruitToBox(new Apple());
            } else littleBox.addFruitToBox(new Orange());
        }

        for (int i = 0; i < 10 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                veryBigBox.addFruitToBox(new Apple());
            } else veryBigBox.addFruitToBox(new Orange());
        }

        for (int i = 0; i < 10 + (int) (Math.random() * 50); i++) {
            if (0 + (int) (Math.random() * 100) < 50) {
                smallBox.addFruitToBox(new Apple());
            } else smallBox.addFruitToBox(new Orange());
        }

        bigBox.fruitAnotherBox(littleBox, 1 + (int) (Math.random() * 10));
        bigBox.fruitAnotherBox(smallBox, 1 + (int) (Math.random() * 10));
        bigBox.fruitAnotherBox(veryBigBox, 1 + (int) (Math.random() * 10));
        smallBox.fruitAnotherBox(littleBox, 1 + (int) (Math.random() * 10));


        System.out.println(bigBox.compare(littleBox));
        System.out.println(bigBox.compare(smallBox));
        System.out.println(bigBox.compare(veryBigBox));
        System.out.println(bigBox.compare(bigBox));


    }
}

