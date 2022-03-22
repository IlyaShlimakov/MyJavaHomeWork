package org.lesson4;

public class EatFromPlate {
    public static void main(String[] args) {
        int randomAddFood = (int) (0 + Math.random() * 30);

        Plate veryBigPlate = new Plate();

        veryBigPlate.addFood(randomAddFood);

        Animal[] allAnimal = new Animal[3];
        allAnimal[0] = new Cat("Fantic");
        allAnimal[1] = new Dog("Tyga");
        allAnimal[2] = new Dog("Gera");


        for (Animal cat : allAnimal) {
            int randomFood = (int) (0 + Math.random() * 10);
            cat.eat(veryBigPlate, randomFood);
        }

    }
}

