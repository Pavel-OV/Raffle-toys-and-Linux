package RaffleToys.views;

import java.util.Scanner;

public class ViewUser{
    
    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT)
                    return;
                switch (com) {
                    case CREATE:
                        // create();
                        break;
                    case READ:
                        // read();
                        break;
                    case LIST:
                        // list();
                        break;
                    case UPDATE:
                        // updateUser();
                        break;                   
                    case DELETE:
                        // deleteUser();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
    

