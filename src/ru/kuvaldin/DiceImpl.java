package ru.kuvaldin;

import java.util.Random;

public class DiceImpl{
    public static int rollDice(){
        Random rand = new Random();
        int x = rand.nextInt(6);
        return x+1;
    }


}
