package com.epam.mjc.stage0;

public class Dog extends Animal {
    public Dog (){
        super(4, "brown", true);
    }
    public String getDescription(){
        String fur;
        if (this.hasFur)
            fur = "a";
        else
            fur = "no";    
        return "This animal is mostly " + this.color + ". It has " 
            + this.numberOfPaws + " paws and " + fur + " fur."; 
    }
    
}


