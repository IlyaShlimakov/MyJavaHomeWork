package org.lesson4;

public class Plate {
    int amountOfFood = 0;

    public void addFood(int food) {
        if (food > 0) {
            amountOfFood+=food;
        }
    }
}

