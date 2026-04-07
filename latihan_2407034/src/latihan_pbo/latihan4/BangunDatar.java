package latihan_pbo.latihan4;

public class BangunDatar {
    // atribut (enkapsulasi)
    private int panjang;
    private int lebar;

    // constructor
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }
}