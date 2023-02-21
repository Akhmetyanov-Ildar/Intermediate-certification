package org.example.service;

import org.example.model.Toy;

import java.util.ArrayList;
import java.util.Comparator;

public class DrawService {

    private ToyService toyService;
    private ArrayList<Toy> toysForRaffle = new ArrayList<>();

    public DrawService(ToyService toyService) {
        this.toyService = toyService;
    }

    public ArrayList<Toy> getToysForRuffle() {
        for (Toy toy : toyService.getToys()) {
            toysForRaffle.add(new Toy(toy.getToysId(), toy.getToysName(), 1, toy.getFrequency()));
            toyService.decreaseToyCount(toy.getToysId());
        }
        sortToysByFrequency();
        return toysForRaffle;
    }

    private void sortToysByFrequency() {
        toysForRaffle.sort(Comparator.comparingInt(Toy::getFrequency));
    }

    public void doRaffle() {
        int toyIndex = toysForRaffle.size() - 1;
        if (toyIndex >=0) {
            toyService.saveToyToFile(toysForRaffle.get(toyIndex));
            toysForRaffle.remove(toyIndex);
            System.out.println(toysForRaffle);
        }

    }

}
