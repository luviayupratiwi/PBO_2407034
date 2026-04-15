package latihan_pbo.latihan4;

public class BangunRuang extends BangunDatar {
    protected double tinggi;


    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari class induk
        this.tinggi = tinggi;
    }


    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    public double hitungVolume2(){
        return hitungVolume() *2;
    }

    public void tampilkanInfoRuang(){
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi:" + tinggi);
    }
}