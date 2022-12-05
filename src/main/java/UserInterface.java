
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author theo.higgins
 */
public class UserInterface {

    private ArrayList<Bird> birds;

    public UserInterface() {
        this.birds = new ArrayList();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        
        do {
            System.out.println("? ");
            command = scanner.nextLine();

            if (command.equals("Quit")) {
                System.exit(0);
            }

            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                birds.add(bird);
            }

            if (command.equals("Observation")) {
                Boolean exists = false;
                System.out.println("Bird? ");
                String searchName = scanner.nextLine();

                for (int i = 0; i < birds.size(); i++) {
                    if (birds.get(i).getName().equals(searchName)) {
                        birds.get(i).incrementObservationCount();
                        exists = true;
                        break;
                    }
                    
                }
                
                if (!exists){
                    System.out.println("Not a bird!");
                }
                

            }

            if (command.equals("All")) {
                for (Bird specie : birds) {
                    System.out.println(specie);
                }
            }

        }
        while (!command.equals("Quit"));
    }

}
