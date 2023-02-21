package org.example.service;

import org.example.model.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ToyService {
    private String fileName = "Raffle result.txt";

    private ArrayList<Toy> toys = new ArrayList<Toy>();

    public Toy addToy(String name, int count, int freq) {
        Toy toy = new Toy(name, count, freq);
        toys.add(toy);
        return toy;
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void setToyFrequency(int id, int newFrequency) {
        for (Toy toy : toys) {
            if (toy.getToysId() == id) {
                toy.setFrequency(newFrequency);
            }
        }
    }

    public void decreaseToyCount(int id) {
        for (Toy toy : toys) {
            if (toy.getToysId() == id) {
                toy.setCount(toy.getCount() - 1);
            }
        }
    }

    public void saveToyToFile(Toy toy) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(toy.toString());
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}




