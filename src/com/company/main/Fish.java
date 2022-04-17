package com.company.main;

public class Fish extends Animal implements AnimalMove, AnimalName{
    private String ScaleColor_Nuri_56870;


    public Fish(){
        super();
        ScaleColor_Nuri_56870 = "NN";
    }


    public Fish(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870, String ScaleColor_Nuri_56870) {
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870);
        this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;
    }


    public Fish(int Weight_Nuri_56870, String ScaleColor_Nuri_56870) {
        super(Weight_Nuri_56870);
        this.ScaleColor_Nuri_56870 = ScaleColor_Nuri_56870;
    }


    public void drinkMilk()
    {System.out.println("Siup Siup");}

    public void getVoice()
    {System.out.println("The Fish purrs");}

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


    // task 8
    @Override
    public void Move_Nuri_56870() throws RuntimeException {
        System.out.println("Fish swim");
    }

    public String getName_Nuri_56870()
    {
        System.out.println("The name of Fish is: " + Name_Nuri_56870);

        return null;
    }
}
