package latihan_pbo.latihan3;

public class PersegiPanjang extends BangunDatar {
    
    public double LuasPersegiPanjang(){
        return getPanjang() * getLebar(); 
    }
    public double KelilingPersegiPanjang(){
        return 2 * getPanjang() + getLebar();
    }
}
