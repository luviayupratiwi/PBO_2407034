package latihan_pbo.latihan7;

public class Segitiga extends BangunDatar {
    private double sisi1, sisi2, sisi3, alas, tinggi;

    public Segitiga(double sisi1, double sisi2, double sisi3, double alas, double tinggi) {
        super("Segitiga");
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}