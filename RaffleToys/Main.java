
package RaffleToys;


import RaffleToys.Toys.ToyStore;
import RaffleToys.Toys.Toys;


public class Main {
    public static void main(String[] args) {
        ToyStore mart = new ToyStore();
        System.out.println("Это магазин игрушек. Можно просмотреть список игрушек, некоторые параметры - вес краткое описание ");  
        System.out.println("Добавить игрушку, изменить вес  Выберете действие");
       
        mart.addToys(new Toys(1,"Баба Яга", 3, 150))
            .addToys(new Toys(2, "Змей Горыныч", 5 ,300))
            .addToys(new Toys(3,"Мяч", 2, 150))
            .addToys(new Toys(4,"Домовой", 1, 150))
            .addToys(new Toys(5,"Баба Яга", 3, 150))
            .addToys(new Toys(6,"Баба Яга", 3, 150))
            .addToys(new Toys(7,"Баба Яга", 3, 150))
            .addToys(new Toys(8,"Баба Яга", 3, 150));
        System.out.println(mart.toString());
    }
        
}