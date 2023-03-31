package mayin_tarlasi;

import java.util.Random;

public class Bomb implements Color {


    public void createBomb(Mayin mayin) {
        Random random = new Random();


        int randomSatir, randomSutun;
        int count = 0;


        while (count <= (mayin.getBoardSize() / 4)) {
            randomSatir = random.nextInt(mayin.getSatirSayisi());
            randomSutun = random.nextInt(mayin.getSutunSayisi());

            if (mayin.getFullboard()[randomSatir][randomSutun] != -1) {
                mayin.getFullboard()[randomSatir][randomSutun] = -1;

                count++;
            }
        }
    }


    public void isBomb(int satir, int sutun, Mayin mayin) {



        if ((mayin.getFullboard()[satir][sutun]) == 0) {

            if ((satir > 0 && sutun > 0) && (mayin.getFullboard()[satir - 1][sutun - 1] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;

            }

            if ((satir > 0) && (mayin.getFullboard()[satir - 1][sutun] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;

            }

            if ((satir > 0 && (sutun < mayin.getSutunSayisi() - 1)) && (mayin.getFullboard()[satir - 1][sutun + 1] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;

            }

            if ((sutun > 0) && (mayin.getFullboard()[satir][sutun - 1] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;
            }

            if ((sutun < mayin.getSutunSayisi() - 1) && (mayin.getFullboard()[satir][sutun + 1] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;
            }

            if ((sutun > 0 && (satir < mayin.getSatirSayisi() - 1)) && (mayin.getFullboard()[satir + 1][sutun - 1] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;
            }

            if ((satir < mayin.getSatirSayisi() - 1) && (mayin.getFullboard()[satir + 1][sutun] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;
            }

            if ((sutun < mayin.getSutunSayisi() - 1 && satir < mayin.getSatirSayisi() - 1) && (mayin.getFullboard()[satir + 1][sutun + 1] == -1)) {
                mayin.getOyuncuBord()[satir][sutun]++;
            }


        }



    }

}

