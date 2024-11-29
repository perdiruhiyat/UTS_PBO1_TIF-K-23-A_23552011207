package PBO1.UTSPBO1;

public class Camilan extends ItemMakanan {
    public Camilan(String namaMenu, double harga){
        super(namaMenu, "Camilan", harga);
    }

    @Override
    public double hitungHarga(){
        return getHarga();
    }

    @Override
    public void persiapkan(){
        System.out.println("Menyiapkan Camilan : " + getNamaMenu());
    }

    @Override
        public void sajikan(){
            System.out.println("Menyajikan Camilan : " + getNamaMenu());
    }
}
