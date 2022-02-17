package org.lesson5;

import java.util.ArrayList;

public class Box {
    double wightBox = 0;

    ArrayList<Fruit> fruitBox = new ArrayList<Fruit>();

    public void addFruitToBox(Fruit fruit) {
        if (fruitBox.isEmpty() || fruitBox.get(0).getClass() == fruit.getClass()) {
            this.fruitBox.add(fruit);
        } else System.out.println("Нельзя это добавить");
    }

    public double getWightBox() {
        wightBox = 0;
        for (Fruit fruit : this.fruitBox) {
            this.wightBox = this.wightBox + fruit.wight;
        }
        return this.wightBox;
    }

    public boolean compare(Box box) {
        if (box.getWightBox() == this.getWightBox()) {
            return true;
        }
        else return false;
    }

    public void fruitAnotherBox(Box box, int howMachFruit) {
        if(fruitBox.size() > howMachFruit) {
            if (this.fruitBox.get(0).getClass() == box.fruitBox.get(0).getClass() || box.fruitBox.isEmpty()) {
                ArrayList<Fruit> tempFruitArray = new ArrayList<Fruit>();
                for (int i = 0; i < howMachFruit; i++) {
                    tempFruitArray.add(this.fruitBox.get(i));
                    this.wightBox = this.wightBox - this.fruitBox.get(i).wight;
                    box.wightBox = box.wightBox + this.fruitBox.get(i).wight;
                }
                box.fruitBox.addAll(tempFruitArray);
                this.fruitBox.removeAll(tempFruitArray);
            } else System.out.println("Не путай тёплое с мягким");
        }
        else System.out.println("Здесь столько нет");
    }
}





