package com.epam.mjc.stage0;

public class Animal {
    private int numberOfPaws;
    private  String color;
    private  boolean hasFur;


    public Animal (String color,int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String fur,paw;
        if (this.hasFur)
            fur = "a";
        else
            fur = "no";    
        if (numberOfPaws>1)
            paw = "paws";
        else
            paw = "paw";
        
        return "This animal is mostly " + this.color + ". It has " 
            + this.numberOfPaws + " "+paw + " and " + fur + " fur."; 
    }
    public static void main(String[] args) {
        Animal animal = new Animal("red", 3, true);
        System.out.println(animal.getDescription());
    }
}
