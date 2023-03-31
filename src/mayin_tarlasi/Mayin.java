package mayin_tarlasi;

public class Mayin {
    private int satirSayisi;
    private int sutunSayisi;

    private int[][] fullboard;
    private int[][] oyuncuBord;

    private int boardSize;


    public Mayin(int satirSayisi, int sutunSayisi) {
        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.fullboard = new int[satirSayisi][sutunSayisi];
        this.oyuncuBord = new int[satirSayisi][sutunSayisi];
        this.boardSize = satirSayisi * sutunSayisi;
    }


    public int getSatirSayisi() {
        return satirSayisi;
    }

    public void setSatirSayisi(int satirSayisi) {
        this.satirSayisi = satirSayisi;
    }

    public int getSutunSayisi() {
        return sutunSayisi;
    }

    public void setSutunSayisi(int sutunSayisi) {
        this.sutunSayisi = sutunSayisi;
    }

    public int[][] getFullboard() {
        return fullboard;
    }

    public void setFullboard(int[][] fullboard) {
        this.fullboard = fullboard;
    }

    public int[][] getOyuncuBord() {
        return oyuncuBord;
    }

    public void setOyuncuBord(int[][] oyuncuBord) {
        this.oyuncuBord = oyuncuBord;
    }

    public int getBoardSize() {
        return boardSize;
    }

}
