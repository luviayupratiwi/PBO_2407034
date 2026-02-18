package latihan_pbo.latihan2;

// ENCAPSULATION
// ACCESS MODIFIER (PUBLIC, PRIVATE, PROTECTED)


// class PersegiPanjang{
//     private int panjang;
//     private int lebar;

//     void tampil() {
//     }

//     public int getPanjang() {
//         return panjang;
//     }

//     public void setPanjang(int panjang) {
//         this.panjang = panjang;
//     }

//     public int getLebar() {
//         return lebar;
//     }

//     public void setLebar(int lebar) {
//         this.lebar = lebar;
//     }

// }


// public class Main {
//     public static void main(String[] args) {
//         PersegiPanjang p = new PersegiPanjang();
//         p.setPanjang(9);
//         p.setLebar(10);
//         System.out.println(p.getPanjang());
//         System.out.println(p.getLebar());
//     }
// }

// 

class PersegiPanjang {

    // atribut (dibuat private)
    private int panjang;
    private int lebar;

    // setter panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // getter panjang
    public int getPanjang() {
        return panjang;
    }

    // setter lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // getter lebar
    public int getLebar() {
        return lebar;
    }

    // method tambahan (biar lebih lengkap)
    public int hitungLuas() {
        return panjang * lebar;
    }

    // method menghitung keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Main {

    public static void main(String[] args) {

        PersegiPanjang pp = new PersegiPanjang();

        pp.setPanjang(10);
        pp.setLebar(5);

        System.out.println("Panjang : " + pp.getPanjang());
        System.out.println("Lebar   : " + pp.getLebar());
        System.out.println("Luas    : " + pp.hitungLuas());
        System.out.println("Keliling  : " + pp.hitungKeliling());
    }
}