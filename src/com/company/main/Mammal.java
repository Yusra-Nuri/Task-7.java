package com.company.main;

public class Mammal extends Animal implements AnimalMove, AnimalName{
    private String Order_Nuri_56870;

    public Mammal(){
        super();
        Order_Nuri_56870 = "NN";
    }

    public Mammal(String Name_Nuri_56870, int Age_Nuri_56870, int Weight_Nuri_56870,String Order_Nuri_56870){
        super(Name_Nuri_56870, Age_Nuri_56870, Weight_Nuri_56870);
        this.Order_Nuri_56870 = Order_Nuri_56870;
    }

    public Mammal(int Age_Nuri_56870, String Order_Nuri_56870){
        super(Age_Nuri_56870);
        this.Order_Nuri_56870 = Order_Nuri_56870;
    }

    public void getDrinkMilk()
    {System.out.println("Siup siup");}

    @Override
    public void getVoice() {
        System.out.println("Mammal is making sounds as squeak squeak");
    }

    public String getOrder_Nuri_56870()
    {return Order_Nuri_56870;}

    public void setOrder_Nuri_56870(String Order_Nuri_56870)
    {this.Order_Nuri_56870 = Order_Nuri_56870;}



    public String toString(){
        return "Mammal{"+
                "Order" + Order_Nuri_56870 + '\'' +
                '}';
    }

    // task 8
    @Override
    public void Move_Nuri_56870() throws RuntimeException {
        System.out.println("Mammal move");
    }

    public String getName_Nuri_56870()
    {
        System.out.println("The name of Mammal is: " + Name_Nuri_56870);
        return null;
    }
}
