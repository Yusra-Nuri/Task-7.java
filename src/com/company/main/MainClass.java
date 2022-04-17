package com.company.main;

public class MainClass {
    public static void main(String[] args) {
        Animal[] animal = new Animal[6];
        animal[0] = new Mammal("cutie pie", 2, 2, "Bat");
        animal[1] = new Dog("Fluffy", 5, 15, "Carnivorous", "Mastiff");
        animal[2] = new Bird("Plucky", 2, 1, "Blue");
        animal[3] = new Pigeon("Jacobin", 10, 1, "White", "Spain");
        animal[4] = new Fish("AngelFish", 1, 3, "Yellow");
        animal[5] = new Blowfish("Blowfish", 5, 2, "Brown", 10);

        System.out.println("");
        System.out.println("************************************");
        System.out.println("Here are sounds of different animals:");
        System.out.println("");
        animal[0].getVoice();
        animal[1].getVoice();
        animal[2].getVoice();
        animal[3].getVoice();
        animal[4].getVoice();
        animal[5].getVoice();

        System.out.println("");
        System.out.println("**********************************************");
        System.out.println("Let's hear if Dog, Pigeon and blowfish are sleeping");
        System.out.println("");
        AnimalBehaviour[] animalBehaviour = new AnimalBehaviour[3];
        animalBehaviour[0] = new Dog("Fluffy", 5, 15, "Carnivorous", "Mastiff");
        animalBehaviour[1] = new Pigeon("Jacobin", 10, 1, "White", "Spain");
        animalBehaviour[2] = new Blowfish("Blowfish", 5, 2, "Brown", 10);

        animalBehaviour[0].Sleep_Nuri_56870();
        animalBehaviour[1].Sleep_Nuri_56870();
        animalBehaviour[2].Sleep_Nuri_56870();

        System.out.println("");
        System.out.println("Shush! they are sleeping, be quiet.");

        System.out.println("");
        System.out.println("******************************");
        System.out.println("How do different animals move?");
        System.out.println("");
        for (Animal a : animal) {
            a.Move_Nuri_56870();
        }

        System.out.println("");
        System.out.println("****************************************************************");
        System.out.println("Now let's get names of the cute animals we have been looking at:");
        System.out.println("");
        for (Animal a : animal) {
            AnimalName.AnimalName_Nuri(a.getName_Nuri_56870());
        }
    }
}
