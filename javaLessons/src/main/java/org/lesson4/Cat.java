package org.lesson4;

public class Cat extends Animal {
    static int catCount = 0;

    Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance < 200 && distance > 0) super.run(distance);
        else if (distance == 0)
            System.out.printf("%s не может проплыть %d метров, кто вообще может одновременно бежать и не бежать?\n", name, distance);
        else {
            System.out.printf("%s не может пробежать %d метров, он всего лишь кот\n", name, distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance == 0)
            System.out.printf("%s не может проплыть %d метров, кто вообще может одновременно плыть и не плыть?\n", name, distance);
        else {
            System.out.printf("%s не может проплыть %d метров, он вообще не умеет плавать, он всего лишь кот\n", name, distance);
        }
    }
}
