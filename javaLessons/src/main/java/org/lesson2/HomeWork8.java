package org.lesson2;
//Task8
public class HomeWork8 {
    public static void main(String[] args) {
        int[][] array = new int[15][15];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i == j ?  1 : (int) (10 + Math.random() * 20);
                array[i][j] = i+j+1 == array.length ? 1 : array[i][j];
                System.out.print(array[i][j]+" ");
            }

        }
    }
}
