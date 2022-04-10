package com.company.main;

public class Blowfish extends Fish{

    private String ScaleColor_Nuri_56870;
    private int Diameter_Nuri_56870;

    Blowfish(){
        super();
        ScaleColor_Nuri_56870 = " ";
        Diameter_Nuri_56870= 0;
    }

    public Blowfish(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String ScaleColor_Nuri_56870, int Diameter_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870, ScaleColor_Nuri_56870);
        this.Diameter_Nuri_56870 = Diameter_Nuri_56870;
        this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;
    }

    public Blowfish(int Weight_Nuri_56870, String ScaleColor_Nuri_56870, int Diameter_Nuri_56870) {
        super(Weight_Nuri_56870, ScaleColor_Nuri_56870);
        this.Diameter_Nuri_56870 = Diameter_Nuri_56870;
    }



    public void drinkMilk()
    {
        System.out.println("The Blowfish is drinking milk");
    }

    public void eat(String foodName)
    {
        System.out.println("The Pigeon is eating" + foodName);
    }

    // get, set and to string
    public String getScaleColor_Nuri_56870()
    {
        return ScaleColor_Nuri_56870;
    }
    public int Diameter_Nuri_56870()
    {
        return Diameter_Nuri_56870;
    }

    public void setScaleColor_Nuri_56870(String ScaleColor_Nuri_56870)
    {
        this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;
    }

    public void Diameter_Nuri_56870(int Diameter_Nuri_56870)
    {
        this.Diameter_Nuri_56870 = Diameter_Nuri_56870;
    }

    public String toString()
    {
        return "Blowfish{" +
                "ScaleColor ='" + ScaleColor_Nuri_56870 + '\'' +
                '}';

    }
}
