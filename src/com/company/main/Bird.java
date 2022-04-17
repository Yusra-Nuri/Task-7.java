package com.company.main;

public class Bird extends Animal implements AnimalMove, AnimalName{
    private String FeatherColor_Nuri_56870;


    public Bird(){
        super();
        FeatherColor_Nuri_56870 = "NN";
    }


    public Bird(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String FeatherColor_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870);
        this.FeatherColor_Nuri_56870 = FeatherColor_Nuri_56870;
    }


    public Bird(int Name_Nuri_56870, String FeatherColor_Nuri_56870) {
        super(Name_Nuri_56870);
        this.FeatherColor_Nuri_56870 = FeatherColor_Nuri_56870;
    }

    public void DrinkMilk()
    {System.out.println("Siup Siup");}

    public void eat(String foodName)
    {System.out.println("Bird is eating: " + foodName);}


    public void getVoice()
    {System.out.println("Bird is making sounds as Quack quack");}

    public String getFeatherColor_Nuri_56870()
    {return FeatherColor_Nuri_56870;}

    public void setFeatherColor_Nuri_56870(String featherColor_Nuri_56870)
    {this.FeatherColor_Nuri_56870 = featherColor_Nuri_56870;}



    public String toString(){
        return "Bird{"+
                "FeatherColor" + FeatherColor_Nuri_56870 + '\'' +
                '}';
    }

    // task 8
    @Override
    public void Move_Nuri_56870() throws RuntimeException {
        System.out.println("Bird fly");
    }

    public String getName_Nuri_56870() {
        System.out.println("The name of Bird is: " + Name_Nuri_56870);
        return null;
    }
}
