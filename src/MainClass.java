import java.util.Random;
import java.util.Scanner;

public class MainClass {

    private static Scanner fScanner = new Scanner(System.in);
    private static Random fRandom = new Random();

    public static void main(String[] args) {

        System.out.println("Программа загадала число от 0 до 9. Угадайте его!");

        int xUserChoose = 1;

        while ( xUserChoose==1)
        {
            gameLoop();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            xUserChoose = fScanner.nextInt();

        }


    }

    public static void gameLoop()
    {
        int fQuestNum = fRandom.nextInt(10);
        int fTryCnt = 3;
        for (int i = 0; i< fTryCnt; i++)
        {
            System.out.println("Введите число");

            int xAnswer = fScanner.nextInt();
            if(xAnswer == fQuestNum){
                System.out.println("Правильно!");
                return;
            }
            else if(xAnswer < fQuestNum){
                System.out.println("Ваше число меньше!");
            }
            else {
                System.out.println("Ваше число больше!");
            }
        }
        System.out.printf("Вы не угадали. Правильный ответ: %d.\n", fQuestNum);
    }
}
