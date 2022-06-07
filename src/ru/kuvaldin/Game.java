package ru.kuvaldin;

public class Game {
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int play(){
        return DiceImpl.rollDice();
    }



}
