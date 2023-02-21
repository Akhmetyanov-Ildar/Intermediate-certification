package org.example.controller;

import org.example.service.DrawService;
import org.example.model.Toy;
import org.example.service.ToyService;

import java.util.ArrayList;

public class ShopController {

    private ToyService toyService = new ToyService();
    private DrawService drawService = new DrawService(toyService);

    public Toy addToy(String name, int count, int freq) {
        return toyService.addToy(name, count, freq);
    }

    public ArrayList<Toy> getToysForRaffle() {
        return drawService.getToysForRuffle();
    }

    public void doRaffle() {
        drawService.doRaffle();
    }
}
