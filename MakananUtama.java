package PBO1.UTSPBO1;

public class MakananUtama extends ItemMakanan {

    public MakananUtama(String namaMenu, double harga){
        super(namaMenu, "Makanan Utama", harga);
    }

    @Override
    public double hitungHarga(){
        return getHarga();
    }

    @Override
    public void persiapkan(){
        System.out.println("Menyiapkan Makanan Utama : " + getNamaMenu());
    }

    @Override
        public void sajikan(){
            System.out.println("Menyajikan Makanan Utama : " + getNamaMenu());
    }
}