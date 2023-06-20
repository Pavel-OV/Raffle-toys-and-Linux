
package RaffleToys;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import RaffleToys.Toys.ToyStore;
import RaffleToys.Toys.Toys;
import RaffleToys.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        ToyStore mart = new ToyStore();
        System.out.println("Это магазин игрушек. Можно просмотреть список игрушек, некоторые параметры - вес краткое описание ");  
        System.out.println("Добавить игрушку, изменить вес  Выберете действие");
       
        mart.addToys(new Toys(1,"Баба Яга", "3", "150"))
            .addToys(new Toys(2, "Змей Горыныч", "5" ,"300"));
        System.out.println(mart.toString());
    }
        
}