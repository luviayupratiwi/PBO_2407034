package latihan_pbo.latihan6;

public class main {
    
    public static void Main(String[] args) {

        menu menu;

        menu = new menuitem("Nasi Goreng", 15000, 2);
        menu.tampilkan();

        menu = new menuitem("Mie Ayam", 12000, 3);
        menu.tampilkan();

        menu = new menuitem("Es Teh", 5000, 4);
        menu.tampilkan();
    }
}
