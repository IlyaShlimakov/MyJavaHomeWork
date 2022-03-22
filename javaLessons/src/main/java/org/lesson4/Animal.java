package org.lesson4;

public class Animal {
    static int animalCount = 0;
    boolean satiety = false;

    String name;

    Animal(String name) {

        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
    }

    ;

    public void swim(int distance) {
    }

    ;

    public void eat(Plate plate, int howMuchEat) {
        if (plate.amountOfFood > howMuchEat) {
            satiety = true;
            plate.amountOfFood = plate.amountOfFood - howMuchEat;
            System.out.printf("%s сыт\n", name);
        } else {
            System.out.printf("%s не сыт\n", name);

        }
    }
}