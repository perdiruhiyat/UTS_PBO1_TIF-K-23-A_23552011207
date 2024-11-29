package PBO1.UTSPBO1;

public abstract class ItemMakanan {
    private String namaMenu;
    private String kategori;
    private double harga;

    public ItemMakanan(String namaMenu, String kategori, double harga){
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getNamaMenu(){
        return namaMenu;
    }
    public String getKategori(){
        return kategori;
    }
    
    public double getHarga(){
        return harga;
    }

    public abstract double hitungHarga();

    public abstract void persiapkan();

    public abstract void sajikan();
}
