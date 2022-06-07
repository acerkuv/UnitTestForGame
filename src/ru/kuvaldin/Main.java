package ru.kuvaldin;

public class Main {

    public static void main(String[] args) {
	//
       Game game = new Game();
       game.setName("first");

       Game game1 = new Game();
       game1.setName("second");

       int playFirst = game.play();
       int playSecond = game1.play();

       if (playFirst > playSecond) {
           System.out.println(game.getName());
       }else{
           if (playFirst == playSecond){ System.out.println("No winner");
           }
           else{
               System.out.println(game1.getName());
           }
       }

    }
}
