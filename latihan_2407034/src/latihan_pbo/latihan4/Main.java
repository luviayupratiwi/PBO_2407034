package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        // objek
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        // output
        System.out.println("Luas Alas = " + br.hitungLuas());
        System.out.println("Volume = " + br.hitungVolume());
    }
}