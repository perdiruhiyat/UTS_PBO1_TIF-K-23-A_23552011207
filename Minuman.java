package PBO1.UTSPBO1;

public class Minuman extends ItemMakanan{
    private String ukuran;

    public Minuman(String namaMenu, double harga, String ukuran){
        super(namaMenu, "Minuman", harga);
        this.ukuran = ukuran;
    }

    public String getUkuran(){
        return ukuran;
    }

    @Override
    public double hitungHarga(){
        if (ukuran.equalsIgnoreCase("Besar")) {
            return getHarga() + 5000;
        } else if (ukuran.equalsIgnoreCase("Sedang")) {
            return getHarga() + 2500;
        } else {
            return getHarga();
        }
    }
    
    @Override
    public void persiapkan(){
        double biayaTambahan = 0;
        if (ukuran.equalsIgnoreCase("Besar")) {
            biayaTambahan = 5000;
        } else if (ukuran.equalsIgnoreCase("Sedang")) {
            biayaTambahan = 2500;
        }
        System.out.println("Menyiapkan Minuman : " + getNamaMenu() + " dengan Ukuran : " + getUkuran() + " (Biaya Tambahan : Rp. " + biayaTambahan +")");
    }

    @Override
        public void sajikan(){
            System.out.println("Menyajikan Minuman : " + getNamaMenu());
    }
}
