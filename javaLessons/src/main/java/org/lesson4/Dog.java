package org.lesson4;

public class Dog extends Animal {
    static int dogCount=0;
    Dog(String name) {
        super(name);
        dogCount++;
    } @Override
    public void run(int distance) {
        if (distance < 500 && distance > 0) super.run(distance);
        else if (distance == 0)
            System.out.printf("%s не может пробежать %d метров, кто вообще может одновременно бежать и не бежать?\n", name, distance);
        else {
            System.out.printf("%s не может пробежать %d метров, он всего лишь собака\n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 10 && distance > 0) super.swim(distance);
        else if (distance == 0)
            System.out.printf("%s не может проплыть %d метров, кто вообще может одновременно плыть и не плыть?\n", name, distance);
        else {
            System.out.printf("%s не может проплыть %d метров, он всего лишь собака\n", name, distance);
        }
    }
}
