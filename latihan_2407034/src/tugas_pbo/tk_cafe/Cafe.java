package tugas_pbo.tk_cafe;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    private ArrayList<Menu> daftarMenu;

    // Constructor
    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        this.daftarMenu = new ArrayList<>();
    }

    // Method untuk menambah menu
    public void tambahMenu(Menu menu) {
        if (menu != null) {
            daftarMenu.add(menu);
        } else {
            System.out.println("Menu tidak boleh null!");
        }
    }

    // Method untuk menampilkan semua menu
    public void tampilkanMenu() {
        System.out.println("\n===== " + namaCafe + " =====");

        if (daftarMenu.isEmpty()) {
            System.out.println("Belum ada menu tersedia.");
        } else {
            for (int i = 0; i < daftarMenu.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarMenu.get(i).detailMenu();
            }
        }
    }

    // Method untuk mengambil menu berdasarkan index
    public Menu getMenu(int index) {
        if (index >= 0 && index < daftarMenu.size()) {
            return daftarMenu.get(index);
        } else {
            System.out.println("Index menu tidak valid!");
            return null;
        }
    }

    // Method untuk menghitung jumlah menu
    public int jumlahMenu() {
        return daftarMenu.size();
    }

    // Getter untuk nama cafe
    public String getNamaCafe() {
        return namaCafe;
    }

    // Setter untuk nama cafe
    public void setNamaCafe(String namaCafe) {
        this.namaCafe = namaCafe;
    }
}