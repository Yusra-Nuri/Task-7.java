package com.company.main;

public class Mammal extends Animal{
    private String Order_Nuri_56870;

    // 1st constructor
    public Mammal(){
        super();
        Order_Nuri_56870 = "NN";
    }

    //2nd constructor
    public Mammal(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870,String Order_Nuri_56870){
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870);
        this.Order_Nuri_56870 = Order_Nuri_56870;
    }

    // 3rd constructor
    public Mammal(int Age_Nuri_56870, String Order_Nuri_56870){
        super(Age_Nuri_56870);
        this.Order_Nuri_56870 = Order_Nuri_56870;
    }

    public void getDrinkMilk()
    {System.out.println("Siup siup");}

    public void getVoice()
    {System.out.println("Mammal is making sounds");}

    public void getEat(String foodName)
    {System.out.println("Mammal is eating: " + foodName);}

    public String getOrder_Nuri_56870()
    {return Order_Nuri_56870;}

    public void setOrder_Nuri_56870(String Order_Nuri_56870)
    {this.Order_Nuri_56870 = Order_Nuri_56870;}

    public String toString(){
        return "Mammal{"+
                "Order" + Order_Nuri_56870 + '\'' +
                '}';
    }
}
