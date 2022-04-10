package com.company.main;

public class Dog extends Mammal {
    // additional field
    private String breed_Nuri_56870;

    // 1st constructor
    Dog(){
        super();
        breed_Nuri_56870 = "NN";
    }

    // 2nd constructor
    public Dog(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String rzad_Nuri_56870, String breed_Nuri_56870){
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870, rzad_Nuri_56870);
        this.breed_Nuri_56870 = breed_Nuri_56870;
    }

    // 3rd constructor
    public Dog(int Age_Nuri_56870, String rzad_Nuri_56870, String breed_Nuri_56870){
        super(Age_Nuri_56870, rzad_Nuri_56870);
        this.breed_Nuri_56870 = breed_Nuri_56870;
    }

    // additional method
    /*public void aport()
    {
        System.out.println("The dog is retrieving.");
    }*/

    // overriding methods from abstract class
    public void getDrinkMilk(){
        System.out.println("The dog is drinking Milk.");
    }

    public void getVoice()
    {
        System.out.println("The dog is barking.");
    }

    public void getEat(String foodName)
    {
        System.out.println("The dog is eating" + foodName);
    }


    public String getBreed_Nuri_56870()
    {
        return breed_Nuri_56870;
    }

    public void setBreed_Nuri_56870(String Breed_Nuri_56870)
    {
        this.breed_Nuri_56870 = breed_Nuri_56870;
    }

    public String toString()
    {
        return "Dog{" +
                "breed ='" + breed_Nuri_56870 + '\'' +
                '}';
    }
}
