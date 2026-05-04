package tugas_pbo.tk_cafe;

class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    // Override
    @Override
    public void detailMenu() {
        System.out.println(
                "Minuman : " + getNama() +
                " | Ukuran : " + ukuran +
                " | Harga : Rp" + getHarga()
        );
    }
}