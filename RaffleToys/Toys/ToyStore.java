package RaffleToys.Toys;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toys> toy = new ArrayList<>();

    public ToyStore addToys(Toys toys) { // добавляем дополнительную игрушку
        toy.add(toys);
        return this;
    }

    public Toys searchToys(String stoysName) { // ищем игрушку по имени

        for (Toys item : toy) {
            if (item.getToysName().equals(stoysName)) {
                return item;
            }
        }
        return null;

    }

    public void editToysWeight(int id, int weight) { // изменяем вес игрушки по id
        for (Toys toys : toy) {
            if (toys.getId() == id) {
                toys.setWeight(weight);
                return;
            }

        }
        System.out.println("id " + id + " no");

    }

    @Override
    public String toString() {
        StringBuilder lst = new StringBuilder();
        for (Toys item : toy) {
            lst.append(item);
            lst.append("\n");
        }
        return lst.toString();

    }

    

    public Toys drawingPrizeToys() {
        Random rnd = new Random();
        int totalWeight = 0;
        for (Toys toy : toy) {
            totalWeight += toy.getWeight();
        }
        int randWeight = rnd.nextInt(totalWeight);
        int currentWeight = 0;
        for (Toys toy : toy) {
            currentWeight += toy.getWeight();
            if (currentWeight > randWeight) {
                toy.setQuantity(toy.getQuantity() - 1);
                writeToFile(toy.getToysName());
                return toy;
            }
        }
        return null;

    }

    private void writeToFile(String toyName) {
        try {
            FileOutputStream fos = new FileOutputStream("prizes.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);
            writer.write(toyName + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
