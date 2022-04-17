package com.company.main;

public class Pigeon extends Bird implements AnimalBehaviour, AnimalMove, AnimalName{

    private String FeatherColor_Nuri_56870;
    private String Species_Nuri_56870;

    Pigeon(){
        super();
        FeatherColor_Nuri_56870 = Species_Nuri_56870 = " ";

    }

    public Pigeon(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String FeatherColor_Nuri_56870, String Species_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870, FeatherColor_Nuri_56870);
        this.FeatherColor_Nuri_56870 = FeatherColor_Nuri_56870;
        this.Species_Nuri_56870 = Species_Nuri_56870;
    }

    public Pigeon(int Age_Nuri_56870, String FeatherColor_Nuri_56870, String Species_Nuri_56870) {
        super(Age_Nuri_56870, FeatherColor_Nuri_56870);
        this.Species_Nuri_56870 = Species_Nuri_56870;
    }

    public void drinkMilk(){
        System.out.println("The Pigeon is drinking Milk.");
    }

    public void eat(String foodName)
    {
        System.out.println("The Pigeon is eating" + foodName);
    }

    public String getFeatherColor_Nuri_56870()
    {
        return FeatherColor_Nuri_56870;
    }

    public String getSpecies_Nuri_56870()
    {
        return Species_Nuri_56870;
    }

    public void setFeatherColor_Nuri_56870(String FeatherColor_Nuri_56870)
    {
        this.FeatherColor_Nuri_56870 = FeatherColor_Nuri_56870;
    }

    public void setSpecies_Nuri_56870(String FeatherColor_Nuri_56870)
    {
        this.Species_Nuri_56870 = FeatherColor_Nuri_56870;
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon is making sounds as cooing cooing");
    }


    public String toString()
    {
        return "Pigeon{" +
                "FeatherColor ='" + FeatherColor_Nuri_56870 + '\'' +
                '}';

    }

    //task 8
    @Override
    public void Sleep_Nuri_56870()
    {
        System.out.println("zzz");
    }

    @Override
    public void Move_Nuri_56870() throws RuntimeException {
        System.out.println("Pigeon fly");
    }

    public String getName_Nuri_56870()
    {
        System.out.println("The name of Pigeon is: " + Name_Nuri_56870);
        return null;
    }
}
