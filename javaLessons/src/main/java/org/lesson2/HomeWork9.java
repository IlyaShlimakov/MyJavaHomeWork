package org.lesson2;
//Task9
public class HomeWork9 {
    public static int[] createArray(int len, int initialValue) {
        int array[] = new int[len];
        for (int i : array) {
            array[i] = initialValue;
            System.out.println(array[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        createArray(128, 256);
    }
}

