package PBO1.UTSPBO1;

public class SistemRestoran {
    public static void main(String[] args) {
        //untuk tambah menu
        MakananUtama makanan1 = new MakananUtama("Nasi Goreng", 25000);
        MakananUtama makanan2 = new MakananUtama("Kwetiaw Goreng", 22000);
        Minuman minuman1 = new Minuman("Jus Jeruk", 5000, "Besar");
        Minuman minuman2 = new Minuman("Jus Apel", 6000,"Sedang");
        Camilan camilan1 = new Camilan("Pisang Goreng", 2000);
        Camilan camilan2 = new Camilan("Kue Kacang", 3000);

        LaporanPenjualan laporan = new LaporanPenjualan();

        //membuat pesanan dan memproses pesanan
        Pesanan pesanan1 = new Pesanan();
        pesanan1.tambahItem(makanan1);
        pesanan1.tambahItem(minuman1);
        pesanan1.tambahItem(camilan2);

        System.out.println("=================== Pesanan 1 ====================");
        pesanan1.prosesPesanan();
        pesanan1.cetakPesanan();
        laporan.tambahPesanan(pesanan1);

        Pesanan pesanan2 = new Pesanan();
        pesanan2.tambahItem(makanan2);
        pesanan2.tambahItem(minuman1);
        pesanan2.tambahItem(camilan2);
        System.out.println("=================== Pesanan 2 ====================");
        pesanan2.prosesPesanan();
        pesanan2.cetakPesanan();
        laporan.tambahPesanan(pesanan2);

        laporan.cetakLaporan();

    }
}
