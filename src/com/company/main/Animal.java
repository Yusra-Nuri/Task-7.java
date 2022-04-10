package com.company.main;

abstract class Animal {

    private String Name_Nuri_56870;

    private int Age_Nuri_56870, Weight_Nuri_56870;
    //private String getEat;
    public Animal(){
        Age_Nuri_56870 = Weight_Nuri_56870 = 0;
        Name_Nuri_56870 = "NN";
    }
    public Animal (String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870){
        this.Name_Nuri_56870 = Name_Nuri_56870;
        this.Age_Nuri_56870 = Age_Nuri_56870;
        this.Weight_Nuri_56870 = Weight_Nuri_56870;
    }

    public Animal(int Age_Nuri_56870)
    { this.Age_Nuri_56870 = Age_Nuri_56870;}

   // public abstract void getEat(String foodName);

    public abstract void getVoice();
   // public abstract void getEat();
   // public abstract void getDrinkMilk();

    public String getName_Nuri_56870()
    {return Name_Nuri_56870;}
    public void SetName_Nuri_56870()
    {this.Name_Nuri_56870 = Name_Nuri_56870;}
    public int getAge_Nuri_56870()
    {return Age_Nuri_56870;}
    public void setAge_Nuri_56870(int Age_Nuri_56870)
    {this.Age_Nuri_56870 = Age_Nuri_56870;}
    public int getWeight_Nuri_56870()
    {return Weight_Nuri_56870;}
    public void setWeight_Nuri_56870(int Weight_Nuri_56870)
    {this.Weight_Nuri_56870 = Weight_Nuri_56870;}
}
