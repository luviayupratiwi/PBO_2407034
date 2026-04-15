package latihan_pbo.latihan5;

public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    public double hitungLuas() {
        return varA * varB;
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("====================");
        System.out.println("Panjang: " + varA);
        System.out.println("Lebar: " + varB);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("====================");
    }
}