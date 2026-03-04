package tugas_pbo;

import java.util.Scanner;

// ============== CLASS INDUK ==============
abstract class BangunDatar {

    protected void tampilInfo(String nama) {
        System.out.println("\n=== KALKULATOR " + nama.toUpperCase() + " ===");
    }

    public abstract double luas();
    public abstract double keliling();
}

// ============== PERSEGI ==============
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }
}

// ============== PERSEGI PANJANG ==============
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }
}

// ============== SEGITIGA ==============
class Segitiga extends BangunDatar {
    private double alas, tinggi;
    private double s1, s2, s3;

    public Segitiga(double alas, double tinggi, double s1, double s2, double s3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return s1 + s2 + s3;
    }
}

// ============== LINGKARAN ==============
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

// ============== MAIN CLASS ==============
public class tugas2_2407034 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = null;

        System.out.println("=== MENU BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                bd = new Persegi(input.nextDouble());
                bd.tampilInfo("Persegi");
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                bd = new PersegiPanjang(p, l);
                bd.tampilInfo("Persegi Panjang");
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.print("Masukkan sisi 1: ");
                double s1 = input.nextDouble();
                System.out.print("Masukkan sisi 2: ");
                double s2 = input.nextDouble();
                System.out.print("Masukkan sisi 3: ");
                double s3 = input.nextDouble();
                bd = new Segitiga(a, t, s1, s2, s3);
                bd.tampilInfo("Segitiga");
                break;

            case 4:
                System.out.print("Masukkan jari-jari: ");
                bd = new Lingkaran(input.nextDouble());
                bd.tampilInfo("Lingkaran");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        if (bd != null) {
            System.out.println("Luas      : " + bd.luas());
            System.out.println("Keliling  : " + bd.keliling());
        }

        input.close();
    }
}