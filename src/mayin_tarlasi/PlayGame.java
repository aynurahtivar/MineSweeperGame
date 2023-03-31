package mayin_tarlasi;

import java.util.Random;
import java.util.Scanner;

public class PlayGame implements Color {

    Scanner scan = new Scanner(System.in);

    Bomb bomb = new Bomb();


    PlayGame play;
    Mayin mayin;


    public void createApp() {
        giris();

        int count = 0;
        boolean isOver = true;

        System.out.println(PURPLE_B + "   ----> LET'S PLAY <----     ");
        while (isOver) {
            printBoard(mayin.getOyuncuBord());
            System.out.print(WHITE_B + "Satir : ");
            int satir = Math.abs(scan.nextInt());
            System.out.print(WHITE_B + "Sutun : ");
            int sutun = Math.abs(scan.nextInt());

            if (mayin.getFullboard()[satir][sutun] != -1) {
                bomb.isBomb(satir, sutun, mayin);
                count++;
                if (count == mayin.getBoardSize()-(mayin.getBoardSize() / 4)-1) {
                    System.out.println(GREEN_B + "Tebrikler kazandiniz! ");
                    break;
                }
            } else {
                System.out.println(RED_B + "!! Game Over !!");
                System.out.println(RED_B + "---------------> You're Lost!!");
                isOver = false;
            }


        }

    }

    public void giris() {
        System.out.println();
        System.out.println(CYAN + "|||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||> MAYIN TARLASI OYUNUNA HOSGELDINIZ <||||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
        boardInfo();
    }


    public void boardInfo() {
        System.out.print("Mayin oyunu satir sayisi: ");
        int satir = Math.abs(scan.nextInt());
        System.out.print("Mayin oyunu sutun sayisi: ");
        int sutun = Math.abs(scan.nextInt());
        mayin = new Mayin(satir, sutun);
        bomb.createBomb(mayin);
        printBoard(mayin.getFullboard());


    }


    public void printBoard(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%4s", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


}
