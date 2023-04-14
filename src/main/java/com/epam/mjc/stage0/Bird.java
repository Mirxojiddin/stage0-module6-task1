package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird (){
        super(2, "blue", false);
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
            + this.numberOfPaws + " "+paw + " and " + fur + " fur. Moreover, it has 2 wings and can fly."; 
    }
}
