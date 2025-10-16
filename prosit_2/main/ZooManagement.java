package prosit_1.main;

import java.util.Scanner;

import prosit_1.entities.*;

public class ZooManagement{


    public static void main(String[] args) {
        // int nbCages = 20;
        // String nomZoo = "Zoo de Vincennes";
        // System.out.println("Welcome to " + nomZoo + " which has " + nbCages + " cages.");
        // System.out.println("change the name if u want");
        // Scanner sc = new Scanner(System.in);
        // String newName = sc.nextLine();
        // if(!newName.isEmpty()){
        //     nomZoo = newName;
        //     System.out.println("The new name of the zoo is: " + nomZoo);
        // }
        // System.out.println("How many cages do you want to add?");
        // int cagestoadd = sc.nextInt();
        // if(cagestoadd > 0){
        //     nbCages += cagestoadd;
        //     System.out.println("The new number of cages is: " + nbCages);
        // }
        // sc.close();

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
               // Créer un zoo avec le constructeur paramétré
        Zoo myZoo = new Zoo("MyZoo", "Paris", 25);

        // Ajouter des animaux
        if (myZoo.addAnimal(lion)){
            System.out.println("Lion added successfully.");
        } else {
            System.out.println("Failed to add Lion.");
        }
       if (myZoo.addAnimal(elephant)){
            System.out.println("elephant added successfully.");
        } else {
            System.out.println("Failed to add Lion.");
        }

        // Afficher les informations via displayZoo()
        myZoo.displayZoo();

        // Affichage direct avec System.out.println()
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        // Affichage direct pour l'animal
        System.out.println(lion);
        System.out.println(lion.toString());
    }
}