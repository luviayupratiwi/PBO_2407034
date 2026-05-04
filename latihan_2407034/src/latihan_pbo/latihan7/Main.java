package latihan_pbo.latihan7;
public class Main {
    public static void main(String[] args) {
        BangunDatar[] bd = {
            new Persegi(4),
            new Segitiga(4, 5, 6, 3, 3)
        };

        for (BangunDatar b : bd){
            b.Display();
        }
    }
}