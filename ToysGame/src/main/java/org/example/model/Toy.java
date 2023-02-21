package org.example.model;

public class Toy {
    private static int globalId;

    private int toysId;
    private String toysName;
    private int count;
    private int frequency;

    public Toy(String toysName, int count, int frequency) {
         this.toysId = ++globalId;
          this.toysName = toysName;
        this.count = count;
        this.frequency = frequency;
    }

    public Toy(int id, String toysName, int count, int frequency) {
        this.toysId = id;
        this.toysName = toysName;
        this.count = count;
        this.frequency = frequency;
    }

    public int getToysId() {
        return toysId;
    }

    public String getToysName() {
        return toysName;
    }

    public void setToysName(String toysName) {
        this.toysName = toysName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }


    @Override
    public String toString() {
        return "Toy{" +
                "toysId=" + toysId +
                ", toysName='" + toysName + '\'' +
                ", count=" + count +
                ", frequency=" + frequency +
                '}';
    }
}
