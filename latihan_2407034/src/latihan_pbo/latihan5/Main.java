package latihan_pbo.latihan5;

public class Main {

    public static void main(String[] args) {

        BangunDatar bd = new BangunDatar(3,4);
        bd.tampilkan();

        BangunDatar p = new Persegi(5);
        p.tampilkan();

        BangunDatar pp = new PersegiPanjang(6,4);
        pp.tampilkan();

        BangunDatar s = new Segitiga(6,8);
        s.tampilkan();
    }
}