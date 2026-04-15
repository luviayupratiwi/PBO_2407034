package latihan_pbo.latihan5;

public class BangunDatar {

    protected double varA;
    protected double varB;

    // constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("====================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("====================");
    }
}