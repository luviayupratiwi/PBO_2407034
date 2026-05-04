package latihan_pbo.latihan7;

public abstract class BangunDatar {
    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    abstract double hitungLuas();
    abstract double hitungKeliling();

    void Display() {
        System.out.println("Bangun: " + nama);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}