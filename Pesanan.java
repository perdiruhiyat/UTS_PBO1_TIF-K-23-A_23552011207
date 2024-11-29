package PBO1.UTSPBO1;

import java.util.ArrayList;

public class Pesanan {
    private ArrayList<ItemMakanan> items;
    private String status;
    private double totalHarga;

    public Pesanan() {
        this.items = new ArrayList<>();
        this.status = "Pending";
        this.totalHarga = 0;
    }

    public void tambahItem(ItemMakanan item){
        items.add(item);
        hitungTotalBayar();
    }

    public void hitungTotalBayar(){
        totalHarga = 0;
        for(ItemMakanan item : items){
            totalHarga += item.hitungHarga();
        }
    }

    public ArrayList<ItemMakanan> getItems(){
        return new ArrayList<>(items);
    }

    public int getJumlahItem(){
        return items.size();
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public double getTotalHarga(){
        return totalHarga;
    }

    public void prosesPesanan(){
        System.out.println("Pesanan sedang di proses");
        System.out.println("==================================================");
        for(ItemMakanan item : items){
            item.persiapkan();
        }
        System.out.println("==================================================");
        for(ItemMakanan item : items){
            item.sajikan();
        }
        setStatus("Selesai");
        System.out.println("==================================================");
        System.out.println("Pesanan telah selesai");
    }

    public void cetakPesanan(){
        System.out.println("==================================================");
        System.out.println("Jumlah item \t\t: " + getJumlahItem());
        System.out.println("Status Pesanan \t\t: " + getStatus());
        System.out.println("Total Harga Bayar \t: RP. " + getTotalHarga() + "\n");
    }
}
