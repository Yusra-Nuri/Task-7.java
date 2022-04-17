package com.company.main;

public class Dog extends Mammal implements AnimalBehaviour, AnimalMove, AnimalName {
    private String breed_Nuri_56870;

    Dog() {
        super();
        breed_Nuri_56870 = "NN";
    }

    public Dog(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String rzad_Nuri_56870, String breed_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870, rzad_Nuri_56870);
        this.breed_Nuri_56870 = breed_Nuri_56870;
    }

    public Dog(int Age_Nuri_56870, String rzad_Nuri_56870, String breed_Nuri_56870) {
        super(Age_Nuri_56870, rzad_Nuri_56870);
        this.breed_Nuri_56870 = breed_Nuri_56870;
    }

    @Override
    public void getDrinkMilk() {
        System.out.println("The dog is drinking Milk.");
    }

    @Override
    public void getVoice() {
        System.out.println("The dog is barking");
    }


    public String getBreed_Nuri_56870() {
        return breed_Nuri_56870;
    }

    public void setBreed_Nuri_56870(String Breed_Nuri_56870) {
        this.breed_Nuri_56870 = breed_Nuri_56870;
    }

    public String toString() {
        return "Dog{" +
                "breed ='" + breed_Nuri_56870 + '\'' +
                '}';
    }

    // task 8
    @Override
    public void Sleep_Nuri_56870() {
        System.out.println("zzz");
    }

    @Override
    public void Move_Nuri_56870() throws RuntimeException {
        System.out.println("Dog run");
    }

    public String getName_Nuri_56870()
    {
        System.out.println("The name of Dog is: " + Name_Nuri_56870);
        return null;
    }

}
