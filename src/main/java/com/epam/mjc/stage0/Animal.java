package com.epam.mjc.stage0;

public class Animal {
    public int numberOfPaws;
    public  String color;
    public  boolean hasFur;


    public Animal (int numberOfPaws,String color, boolean hasFur){
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
}
