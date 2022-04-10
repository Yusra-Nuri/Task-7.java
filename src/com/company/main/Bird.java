package com.company.main;

public class Bird extends Animal{
    private String FeatherColor_Nuri_56870;

    // 1st Constructor
    public Bird(){
        super();
        FeatherColor_Nuri_56870 = "NN";
    }

    // 2nd constructor
    public Bird(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String FeatherColor_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870);
        this.FeatherColor_Nuri_56870 = FeatherColor_Nuri_56870;
    }

    // 3rd constructor
    public Bird(int Name_Nuri_56870, String FeatherColor_Nuri_56870) {
        super(Name_Nuri_56870);
        this.FeatherColor_Nuri_56870 = FeatherColor_Nuri_56870;
    }

    public void DrinkMilk()
    {System.out.println("Siup Siup");}

    public void eat(String foodName)
    {System.out.println("Bird is eating: " + foodName);}


    public void getVoice()
    {System.out.println("Mammal is making sounds");}

    public String getFeatherColor_Nuri_56870()
    {return FeatherColor_Nuri_56870;}

    public void setFeatherColor_Nuri_56870(String featherColor_Nuri_56870)
    {this.FeatherColor_Nuri_56870 = featherColor_Nuri_56870;}

    public String toString(){
        return "Bird{"+
                "FeatherColor" + FeatherColor_Nuri_56870 + '\'' +
                '}';
    }
}
