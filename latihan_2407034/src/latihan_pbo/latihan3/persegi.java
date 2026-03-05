package latihan_pbo.latihan3;

public class persegi extends BangunDatar {
    public double LuasPersegi(){
        return getSisi() * getSisi(); 
}
public double KelilingPersegi(){
        return 4 * getSisi();
    }
}
