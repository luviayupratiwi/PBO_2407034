package latihan_pbo.latihan4;

public class BangunDatar {
    // atribut (enkapsulasi)
    protected double panjang;
    protected double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    // public int getPanjang() {
    //     return panjang;
    // }

    // public int getLebar() {
    //     return lebar;
    // }

    // method hitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}