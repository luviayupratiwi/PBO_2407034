package latihan_pbo.latihan6;

public class menuitem extends menu {
    protected int jumlah;

    public menuitem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // Override method hitungTotal
    @Override
    public double HitungTotal() {
        return harga * jumlah;
    }

    // Override tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Nama Menu : " + nama);
        System.out.println("Harga     : " + harga);
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Total     : " + HitungTotal());
        System.out.println("========================");
    }
}
