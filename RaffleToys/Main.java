
package RaffleToys;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import RaffleToys.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Это магазин игрушек. Можно просмотреть список игрушек, некоторые параметры - вес краткое описание ");  
        System.out.println("Добавить игрушку, изменить вес  Выберете действие");
        ViewUser view = new ViewUser();
        view.run();

        // Scanner scanner = new Scanner(System.in);
        // int a = scanner.nextInt();
        // if (a == 1) {
        //     System.out.printf("hghgh", a);

        // }
        // if (a == 2) {
        //     System.out.printf("FFFFFF", a);
        // }
        // switch (a){
        //     case 1:
        //     System.out.printf("QQQQQQQQQQQQQQQQQQQ",a);
        //     break;
        //     case 2:
        //     System.out.println("dfghjkhgfgh");
        // }
    }
}