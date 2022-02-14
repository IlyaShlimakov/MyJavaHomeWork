package org.lesson4;

public class RunSwim {
    public static void main(String[] args) {
        Dog Tyga = new Dog("Tyga");
        Dog Gera = new Dog("Gera");
        Cat Fantic = new Cat("Fantic");

        Tyga.run(250);
        Gera.run(600);
        Fantic.run(160);
        Tyga.swim(310);
        Fantic.swim(210);
        System.out.println(Animal.animalCount);
        System.out.println(Cat.catCount);
        System.out.println(Dog.dogCount);
    }
}
