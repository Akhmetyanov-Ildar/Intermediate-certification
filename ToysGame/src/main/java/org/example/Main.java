package org.example;


import org.example.controller.ShopController;

public class Main {
    public static void main(String[] args) {

        ShopController shopController = new ShopController();
        shopController.addToy("Optimus", 12, 45);
        shopController.addToy("Ferrari", 25,30);
        shopController.addToy("Iron man", 5, 10);
        shopController.addToy("Tank", 125, 60);
        shopController.addToy("Moto", 12, 42);
        shopController.addToy("Superman", 125, 75);
        shopController.addToy("SpiderMan", 15, 85);
        shopController.addToy("Lego", 1, 7);
        shopController.addToy("MagicSand", 75, 5);
        shopController.addToy("Tetris", 125, 75);
        shopController.addToy("Snake", 15, 85);

        shopController.getToysForRaffle();
        for (int i = 0; i < 15; i++) {
            shopController.doRaffle();
        }



    }
}