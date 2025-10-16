package prosit_1.main;

import java.util.Scanner;

public class zooManagement{


    public static void main(String[] args) {
        int nbCages = 20;
        String nomZoo = "Zoo de Vincennes";
        System.out.println("Welcome to " + nomZoo + " which has " + nbCages + " cages.");
        System.out.println("change the name if u want");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        if(!newName.isEmpty()){
            nomZoo = newName;
            System.out.println("The new name of the zoo is: " + nomZoo);
        }
        System.out.println("How many cages do you want to add?");
        int cagestoadd = sc.nextInt();
        if(cagestoadd > 0){
            nbCages += cagestoadd;
            System.out.println("The new number of cages is: " + nbCages);
        }
        sc.close();
    }
}