package latihan_pbo.latihan4;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    // constructor
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); // ambil dari class induk
        this.tinggi = tinggi;
    }

    // method hitung volume
    public int hitungVolume() {
        return hitungLuas() * tinggi;
    }
}