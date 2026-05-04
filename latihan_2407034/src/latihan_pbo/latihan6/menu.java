package latihan_pbo.latihan6;

public class menu {
    protected String nama;
    protected double harga;


// Constructor
    public menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double HitungTotal(){
     return 0;
    }

// Method tampilkan
    public void tampilkan() {
        System.out.println("Nama Menu : " + nama);
        System.out.println("Harga     : " + harga);
    }
}
