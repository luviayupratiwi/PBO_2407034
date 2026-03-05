package latihan_pbo.latihan3;

public class lingkaran extends BangunDatar {
    public double LuasLingkaran(){
        return 3.14 * getJari()* getJari();
    }
    public double KelilingLingkaran(){
        return 2 * Math.PI * getJari();
    }
}
