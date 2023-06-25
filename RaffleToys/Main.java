
package RaffleToys;

import java.util.ArrayList;
import java.util.List;

import RaffleToys.Toys.ToyStore;
import RaffleToys.Toys.Toys;

public class Main {
     
    public static void main(String[] args) {
        ToyStore mark = new ToyStore();
        mark.addToys(new Toys(1, "Баба Яга", 3, 150))
                .addToys(new Toys(2, "Змей Горыныч", 5, 300))
                .addToys(new Toys(3, "Корабль", 2, 150))
                .addToys(new Toys(4, "Домовой", 1, 150))
                .addToys(new Toys(5, "Леший", 3, 150))
                .addToys(new Toys(6, "Кукла", 3, 150))
                .addToys(new Toys(7, "Машина", 3, 150))
                .addToys(new Toys(8, "Скакалка", 3, 150));
        // System.out.println("Первоночальный список игрушек");
        // System.out.println(mart.toString());    
       

        mark.editToysWeight(5, 100);
        mark.editToysWeight(2, 300);
        mark.editToysWeight(3, 350);
        mark.editToysWeight(4, 100);
        mark.editToysWeight(5, 200);
        mark.editToysWeight(6, 180);
        mark.editToysWeight(7, 210);
        mark.editToysWeight(8, 85);
        System.out.println("Список игрушек после изменения в веса");        
        System.out.println(mark.toString());
        
        // организация розыгрыша и получение призовых игрушек

        List<Toys> prizeToys = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Toys prizeToy = mark.drawingPrizeToys();
            if (prizeToy != null) {
                prizeToys.add(prizeToy);
            }
        }

        // вывод списка призовых игрушек
        System.out.println("\nСписок призовых игрушек: \n");
        for (Toys toy : prizeToys) {
            System.out.println(toy.getToysName());
        }       

    }

   
}