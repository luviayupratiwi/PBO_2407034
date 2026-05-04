package tugas_pbo.tk_cafe;
// import java.util.ArrayList;
// import java.util.Scanner;

// SUPERCLASS
class Menu {
    private String nama;
    private double harga;

    // Constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Overloading Constructor
    public Menu(String nama) {
        this.nama = nama;
        this.harga = 0;
    }

    // Getter Setter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method
    public void detailMenu() {
        System.out.println(nama + " - Rp" + harga);
    }
}