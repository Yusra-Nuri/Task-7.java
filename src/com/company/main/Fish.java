package com.company.main;

public class Fish extends Animal{
    private String ScaleColor_Nuri_56870;

    // 1st Constructor
    public Fish(){
        super();
        ScaleColor_Nuri_56870 = "NN";
    }

    //2nd constructor
    public Fish(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String ScaleColor_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870);
        this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;
    }

    // 3rd constructor
    public Fish(int Weight_Nuri_56870, String ScaleColor_Nuri_56870) {
        super(Weight_Nuri_56870);
        this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;
    }


    public void drinkMilk()
    {System.out.println("Siup Siup");}

    public void getVoice()
    {System.out.println("Fish is making sounds");}

    public void eat(String foodName)
    {System.out.println("Fish is eating: " + foodName);}

    public String getScaleColor_Nuri_56870()
    {return ScaleColor_Nuri_56870;}

    public void setScaleColor_Nuri_56870(String ScaleColor_Nuri_56870)
    {this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;}

    public String toString(){
        return "Fish{"+
                "ScaleColor" + ScaleColor_Nuri_56870 + '\'' +
                '}';

    }
}
