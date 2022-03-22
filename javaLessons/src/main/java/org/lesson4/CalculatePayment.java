package org.lesson4;

import java.util.ArrayList;

public class CalculatePayment {
    public static void main(String[] args) {
        Payment firstPayment = new Payment("FirstPayment");
        firstPayment.addProduct("Мыло", 100);
        firstPayment.addProduct("Тапки", 10240);
        firstPayment.addProduct("Рыба", 4500);
        firstPayment.addProduct("Мясо", 4400);
        firstPayment.addProduct("Яйца", 23300);
        firstPayment.addProduct("Соль", 1020);
        firstPayment.addProduct("Мука", 6500);
        firstPayment.calculateAllCost();
        firstPayment.showAllProduct();
    }

}

class Payment {

    String paymentName;
    ArrayList<Product> allProduct = new ArrayList<>();

    Payment (String paymentName) {
        this.paymentName = paymentName;
    }

    private static class Product {

        private final String name;
        private final int cost;

        Product(String name, int cost){
            this.name = name;
            this.cost = cost;
        }

        public int getCost() {
            return cost;
        }

        public String getName() {
            return name;
        }
    }

    public void addProduct(String name, int cost) {
        allProduct.add(new Product(name, cost));
    }

    public void showAllProduct(){
        for(Product product:allProduct){
            System.out.println(product.getName());
        }
    }

    public void calculateAllCost (){
        int allCoast = 0;
        for(Product product:allProduct){
            allCoast = allCoast + product.getCost();}
        System.out.println(allCoast);
    }
}