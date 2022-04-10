package com.company.main;

public class MainClass {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Little brown", 2, 2, "Bat");
        animal[1] = new Dog("Butkus", 5, 15, "Carnivora", "Mastiff");
        animal[2] = new Bird("Platypus", 2, 1, "White");
        animal[3] = new Pigeon("Pablo", 10, 1, "Gray", "Spain");
        animal[4] = new Fish("Nemo", 1, 3, "Mixed");
        animal[5] = new Blowfish("Blowfish", 5, 2, "Gray", 10);

        animal[1].getVoice();
        animal[5].getVoice();
        /*animal[3].getVoice();
        animal[4].getVoice();
        animal[5].getVoice();*/
    }
}
