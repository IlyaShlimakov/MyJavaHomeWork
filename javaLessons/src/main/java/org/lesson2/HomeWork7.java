package org.lesson2;
//Task7
public class HomeWork7 {
    public static void main(String[] args) {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < 6 ? array[i] * 2 : array[i];
            System.out.println(array[i]);
        }
    }
}


