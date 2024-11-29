package PBO1.UTSPBO1;

import java.util.ArrayList;

public class LaporanPenjualan {
    private ArrayList<Pesanan> daftarpesanan;

    public LaporanPenjualan() {
        this.daftarpesanan = new ArrayList<>();
    }

    public void tambahPesanan(Pesanan pesanan){
        daftarpesanan.add(pesanan);
    }

    public double hitungTotalPenjualan(){
        double totalPendapatan = 0;
        for(Pesanan pesanan : daftarpesanan){
            totalPendapatan += pesanan.getTotalHarga();
        }
        return totalPendapatan;
    }

    public void cetakLaporan(){
        System.out.println("============== Laporan Penjualan ================");
        System.out.println("Total Pesanan \t\t: " + daftarpesanan.size());
        System.out.println("Total Pendapatan \t: Rp. " + hitungTotalPenjualan());
    }
}
