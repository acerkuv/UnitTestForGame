package ru.kuvaldin.UnitTest;
import ru.kuvaldin.Game;

public class Main {

    public static void main(String[] args) {

        int firstWinnerCountPoints = 0;
        int secondWinnerCountPoints = 0;
        int noWinnersCountPoints = 0;

        Game game = new Game();
        game.setName("first");

        Game game1 = new Game();
        game1.setName("second");

        int triesGame = 10000000;

        for (int i = 0; i < triesGame ; i++) {
            int tempFistGamerPlay = game.play();
            int tempSecondGamerPlay = game1.play();

            if (tempFistGamerPlay == tempSecondGamerPlay){
                noWinnersCountPoints++;
            }else{
                if(tempFistGamerPlay > tempSecondGamerPlay){
                    firstWinnerCountPoints++;
                }else{
                    secondWinnerCountPoints++;
                }
            }

        }

        // Тест пройден, если выпадет 1/6 ничьих и 5/6 отличных результатов ( по теории верояиности ирг в кости)
        float percentsNoWinners  =(float) noWinnersCountPoints / triesGame * 100;
        if (percentsNoWinners > 16.66 & percentsNoWinners < 16.77) System.out.println("Тест пройден " + percentsNoWinners);
        else System.out.println("Тест не пройден " + percentsNoWinners);
    }

}
