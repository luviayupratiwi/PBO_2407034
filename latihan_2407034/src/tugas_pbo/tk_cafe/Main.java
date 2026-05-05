package tugas_pbo.tk_cafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("CAFE KELOMPOK 1");

        // Tambah menu
        cafe.tambahMenu(new Makanan("Nasi Goreng", 15000, "Makanan Berat"));
        cafe.tambahMenu(new Makanan("Mie Ayam", 12000, "Makanan Berat"));
        cafe.tambahMenu(new Makanan("Kentang Goreng", 10000, "Snack"));
        cafe.tambahMenu(new Makanan("Roti Bakar", 8000, "Snack"));
        cafe.tambahMenu(new Makanan("Cheese Cake", 15000, "Dessert"));

        cafe.tambahMenu(new Minuman("Es Teh", 5000, "Medium"));
        cafe.tambahMenu(new Minuman("Es Doger", 8000, "Medium"));
        cafe.tambahMenu(new Minuman("Kopi Susu", 12000, "Large"));
        cafe.tambahMenu(new Minuman("Matcha Latte", 15000, "Large"));
        cafe.tambahMenu(new Minuman("Jus Jeruk", 10000, "Small"));

        int qty;
        double subtotal;
        double total = 0;

        System.out.println("=== SISTEM PEMESANAN CAFE ===");

        String lanjut;

        do {

            cafe.tampilkanMenu();

            System.out.println("0. Selesai");
            System.out.print("Pilih menu: ");
            String pilih = input.next();

            if (pilih.equals("0")) {
                break;
            }

            String[] pilihanMenu = pilih.split(",");

            for (String p : pilihanMenu) {

                int index = Integer.parseInt(p) - 1;

                if (index >= 0 && index < cafe.jumlahMenu()) {

                    Menu menuDipilih = cafe.getMenu(index);

                    System.out.print("Jumlah " + menuDipilih.getNama() + " : ");
                    qty = input.nextInt();

                    subtotal = menuDipilih.getHarga() * qty;

                    total += subtotal;

                    System.out.println(
                            qty + " x " +
                            menuDipilih.getNama() +
                            " = Rp" + subtotal
                    );

                } else {
                    System.out.println("Menu tidak tersedia!");
                }
            }

            System.out.print("\nPesan lagi? (y/n) : ");
            lanjut = input.next();

        } while (lanjut.equalsIgnoreCase("y"));

        // Pajak 10%
        double pajak = total * 0.10;

        // Diskon
        double diskon = 0;

        if (total >= 50000) {
            diskon = total * 0.08;
        } else if (total >= 30000) {
            diskon = total * 0.04;
        }

        // Total akhir
        double totalBayar = total + pajak - diskon;

        // STRUK
        System.out.println("\n====== STRUK PEMBAYARAN ======");
        System.out.println("Subtotal      : Rp" + total);
        System.out.println("Pajak 10%     : Rp" + pajak);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("-------------------------------");
        System.out.println("Total Bayar   : Rp" + totalBayar);

        System.out.println("\nTerima kasih sudah memesan");

        input.close();
    }
}