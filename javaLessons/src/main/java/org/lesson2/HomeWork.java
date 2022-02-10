package org.lesson2;

public class HomeWork {
    //Task 1,2,3,4,*
    public static void main(String[] args) {
        System.out.println(checksum(10, 8));
        checkingPositive(10);
        System.out.println(checkingPositiveElse(10));
        printString("Hi", 5);
        System.out.println(checkLeapYear(418));



    }

    public static boolean checksum(int a, int b) {
        return a + b < 20 && a + b > 10;
    }

    public static void checkingPositive(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean checkingPositiveElse(int a) {
        return a < 0;
    }

    public static void printString(String text, int howmuch) {
        int i = 0;
        while (i < howmuch) {
            System.out.println(text);
            i++;
        }
    }


        public static boolean checkLeapYear ( int year){
            if (year % 400 == 0) {
                return true;
            } else {
                if (year % 100 == 0) {
                    return false;
                } else {
                    return year % 4 == 0;
                }
            }
        }
    }

