# UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Perdi Ruhiyat</li>
  <li>NIM: 2355201207</li>
  <li>Studi Kasus: Sistem Manajemen Restoran</li>
</ul>

## Judul Studi Kasus
<p>Sistem Manajemen Restoran</p>

## Penjelasan Studi Kasus
<p>Studi kasus yang saya buat adalah tentang Sistem Manajemen Restoran yang dimana dirancang untuk mengelola pesanan di restoran. 
  Sistem ini terdiri dari berbagai kelas untuk merepresentasikan menu makanan, pesanan dan laporan penjualan, serta memanfaatkan 
  prinsip OOP seperti Inheritance, polymorphism, encapsulation, dan abstract.
</p>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
Inheritance diterapkan pada class `MakananUtama`, `Minuman`, dan pada `Camilan` yang dimana mewarisi dari class `ItemMakanan`. yang dimana didalam nya terdapat atribut namaMenu, kategori, dan harga. Pada class `Minuman` ditambahkan atribut baru yaitu ukuran.
- output dapat dilihat dari fitur **Tambah Menu**

### 2. Encapsulation
Pada Encapsulation ini digunakan pada class `Pesanan` yang dimana untuk menyembunyikan data pesanan yaitu jumlah item, Status pesanan, dan juga total harga bayar. 
- Akses ke data ini hanya dapat diubah melalui metode getter dan setter.
- contohnya :
- - pada atribut status hanya dapat diubah melalui metode `setStatus()` pada kelas `Pesanan`
  - output data pesanan dapat dilihat dari fitur **Proses Pesanan** 
    

### 3. Polymorphism
Polymorphism diterapkan pada metode `hitungHarga()` yakni di class `ItemMakanan`, yang dimana untuk setiap kelas turunan memiliki perhitungan yang berbeda
- contohnya :
- - pada `Minuman` terdapat atribut baru untuk perhitungan tambahan harga nya,
  - sedangkan pada `MakananUtama` dan juga `Camilan` tidak terdapat tambahan lain
  - outputnya dapat dilihat pada fitur **Proses Pesanan** 

### 4. Abstract
pada Abstrak diterapkan pada kelas `ItemMakanan` yang dimana mendefinisikan kerangkan untuk semua jenis menu makanan dan minuman. ada metode yang harus diimplementasikan pada kelas turunan nya, metode yang dibuat adalah `persiapkan()` dan juga `sajikan()`
- output dapat dilihat pada fitur **Proses Pesanan** 

## Demo Proyek
<ul>
  <li>Google Drive: <a href="https://drive.google.com/drive/folders/1Q2j01o110yebszTnNIwlvvMrYucdd2D9?usp=sharing">Google Drive</a></li>
</ul>
