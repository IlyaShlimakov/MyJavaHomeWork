package org.lesson4;

import java.util.ArrayList;

public class AboutAllPark {

    public static void main(String[] args) {
        Park disneyLand = new Park("DisneyLand");
        disneyLand.addAttraction("Пираты", 12, 8, 22);
        disneyLand.addAttraction("Американские горки", 12, 8, 22);
        disneyLand.addAttraction("Машинки", 12, 8, 22);
        disneyLand.addAttraction("Комната Страха", 12, 8, 22);
        disneyLand.addAttraction("Зазеркалье", 12, 8, 22);
        disneyLand.addAttraction("Ракета", 12, 8, 22);
        disneyLand.addAttraction("Мстители", 12, 8, 22);
        disneyLand.showAllAttraction();
        disneyLand.getAttractionWorkTime();
        disneyLand.getAllCost();

    }

}

class Park {

    String parkName;
    ArrayList<Attraction> allAttraction = new ArrayList<>();

    Park(String parkName) {
        this.parkName = parkName;
    }

    private static class Attraction {

        private final String name;
        private final int cost;
        private final int timeStart;
        private final int timeFinal;

        Attraction(String name, int cost, int timeStart, int timeFinal) {
            this.name = name;
            this.cost = cost;
            this.timeStart = timeStart;
            this.timeFinal = timeFinal;
        }

        public int getCost() {
            return cost;
        }

        public String getName() {
            return name;
        }

        public int getTimeFinal() {
            return timeFinal;
        }

        public int getTimeStart() {
            return timeStart;
        }
    }

    public void addAttraction(String name, int cost, int timeStart, int timeFinal) {
        allAttraction.add(new Attraction(name, cost, timeStart, timeFinal));
    }

    public void showAllAttraction() {
        for (Attraction attraction : allAttraction) {
            System.out.println(attraction.getName());
        }
    }

    public void getAttractionWorkTime() {
        for (Attraction attraction : allAttraction) {
            System.out.println(attraction.getTimeFinal() - attraction.getTimeStart());
        }
    }

    public void getAllCost() {
        for (Attraction attraction : allAttraction) {
            System.out.println(attraction.getCost());
        }
    }

}

