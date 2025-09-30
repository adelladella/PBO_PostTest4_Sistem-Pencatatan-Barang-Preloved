# PBO_PostTest4_Sistem-Pencatatan-Barang-Preloved

---

## Tema: Sistem Pencatatan Barang Preloved
<img width="3780" height="1890" alt="BANNER PBO" src="https://github.com/user-attachments/assets/54ad1130-cec5-437b-ae16-59e9bddf8db1" />

###### Nama: Adella Putri
###### NIM: 2409116006
###### Kelas: A, Sistem Informasi 2024


### Penjelasan Package dan Kegunaannya
#### 1. com.mycompany.preloved
Package utama sebagai “entry point” aplikasi. Di sini ada Preloved.java yang biasanya berfungsi sebagai class dasar untuk menjalankan atau menginisialisasi program.

#### 2. Main
Package ini berisi Main.java yang bertugas menjadi pintu masuk program (method main). Fungsinya untuk mengatur jalannya aplikasi, memanggil class lain, dan menjadi penghubung antara model dan service.

#### 3. Model
Package ini berisi blueprint (class dan interface) yang mewakili data dalam program. Di sini didefinisikan struktur item preloved, invoice, serta interface untuk laporan. Tujuannya agar data bisa terstruktur, reusable, dan mudah dimanipulasi.

#### 4. Service
Package ini berisi class CRUD.java yang menyediakan layanan (service layer) untuk Create, Read, Update, dan Delete data. Dengan adanya service, logika manipulasi data dipisahkan dari struktur data (model) dan dari eksekusi utama (main).

### Penjelasan Class dan Kegunaannya
#### 1. Preloved.java
Class utama dalam package com.mycompany.preloved. Berguna untuk menginisialisasi atau menyiapkan program. Biasanya dijalankan pertama kali sebelum memanggil Main.java.

#### 2. Main.java
Class dengan public static void main(String[] args). Bertugas sebagai pengendali alur program: memanggil fungsi dari CRUD, membuat objek dari model, lalu menampilkan output.

#### 3. AbstractItem.java
Abstract class yang menjadi cetakan umum untuk item preloved. Berisi atribut dasar (misalnya nama, harga, kondisi barang) dan method abstrak yang harus diimplementasikan oleh subclass. Tujuannya agar setiap barang punya struktur seragam.

#### 4. Accessory.java
Subclass dari AbstractItem. Digunakan untuk merepresentasikan barang berupa aksesoris. Berguna agar program bisa membedakan jenis item dengan atribut/karakteristik spesifik.

#### 5. Clothing.java
Subclass lain dari AbstractItem. Digunakan untuk mewakili item berupa pakaian. Sama seperti Accessory, dibuat agar sistem bisa membedakan kategori barang preloved. HMMMMMMMM

#### 6. Product.java
Class ini biasanya menjadi penghubung antar item dengan invoice. Berisi detail barang yang diperdagangkan, termasuk kuantitas atau informasi tambahan. Dibuat supaya data barang lebih fleksibel dan bisa masuk ke invoice.

#### 7. Invoice.java
Class yang mewakili struk/transaksi pembelian. Isinya daftar produk yang dibeli, total harga, dan informasi pembeli. Dibuat agar setiap transaksi bisa tercatat rapi.

#### 8. Reportable.java
Interface yang mendefinisikan method untuk membuat laporan (report). Dengan interface, class lain seperti Invoice bisa menerapkan cara generate laporan sesuai kebutuhan. Tujuannya agar program punya standar pembuatan laporan.

#### 9. CRUD.java
Class service yang mengatur logika Create, Read, Update, Delete data item atau transaksi. Dibuat agar program lebih modular dan perubahan data tidak tercampur dengan tampilan/output.

## Alur Output
**1. Opening**

Saat program dijalankan, sistem menampilkan sambutan pembuka berupa nama aplikasi dan tujuan singkatnya. 

<img width="662" height="160" alt="image" src="https://github.com/user-attachments/assets/d3a84cbc-a489-466c-a5a2-955ad466718e" />

Hal ini berfungsi sebagai pengantar sebelum pengguna masuk ke menu utama. <br>

<br>


**2. Menu Utama**

Pengguna diberikan tujuh pilihan menu yang dapat dijalankan. Pemilihan dilakukan dengan cara memasukkan angka sesuai menu yang tersedia.

<img width="301" height="259" alt="image" src="https://github.com/user-attachments/assets/f6cf33d2-2ba9-4254-8ced-207ac0d69e5c" />


User memilih dengan mengetik angka lalu Enter. <br>

<br>

**3. Lihat Semua Barang (Read)**

Jika pengguna memilih menu untuk melihat semua barang, sistem akan menampilkan daftar barang yang ada di dalam ArrayList barang.

<img width="928" height="460" alt="image" src="https://github.com/user-attachments/assets/fbec5d83-7327-4b9b-95d4-a7a6c02d9fe5" />

Apabila ternyata daftar masih kosong, program akan memberikan informasi bahwa belum ada barang yang tersedia. 

Untuk menampilkan data, program menggunakan perulangan _for_ sehingga setiap barang ditampilkan secara berurutan dengan nomor indeks.

<img width="873" height="480" alt="image" src="https://github.com/user-attachments/assets/93393dc6-7ef5-4a48-b163-5c3e5edf1823" /> <br>

<br>

**4. Tambah Barang (Create)**

User diminta mengisi: 
1. Nama,
2. Kategori,
3. Kondisi (New/Second),
4. Harga (masukkan angka tanpa koma, contoh 75000).

<img width="720" height="122" alt="image" src="https://github.com/user-attachments/assets/c11fdd56-8ed3-4594-9081-7383220d0d76" />

Program membuat objek (Clothing atau Accessory berdasarkan kategori) lalu barang.add(newProduct).

<img width="932" height="260" alt="image" src="https://github.com/user-attachments/assets/5ff30780-737b-4f23-94c3-1808193bbe4e" />

Setelah itu akan menampilkan pesan sukses.

<img width="411" height="30" alt="image" src="https://github.com/user-attachments/assets/0a2d031a-77d9-4a50-97b5-ccc04ffeab0a" />

<br>

**5. Update Barang (Update)**

Fitur update menampilkan seluruh daftar barang. Pengguna memilih nomor barang yang ingin diperbarui. 

<img width="926" height="653" alt="image" src="https://github.com/user-attachments/assets/96a221e5-cb9a-4282-83a6-ffaea5e43114" />

Jika nomor valid, pengguna menginput data baru untuk menggantikan data lama. Jika nomor tidak valid, muncul pesan kesalahan.

<img width="498" height="67" alt="image" src="https://github.com/user-attachments/assets/38eb2a01-2f05-4653-b5bb-bf051fc9d032" /> <br>

<br>

**6. Hapus Barang (jika di Delete maka akan pindah ke Sold Out)**

Menu hapus barang menampilkan daftar barang, lalu pengguna memilih nomor yang ingin dihapus. 

<img width="919" height="557" alt="image" src="https://github.com/user-attachments/assets/79922bbf-b295-4064-8bac-57ec3f751763" />

Setelah semua informasi diinput, barang tersebut dipindahkan dari ArrayList barang ke ArrayList soldOut. 

<img width="475" height="78" alt="image" src="https://github.com/user-attachments/assets/f8f53e17-3286-465f-8817-e3565fe75415" />

Apabila nomor yang dimasukkan tidak valid, maka program menampilkan pesan kesalahan.

<img width="498" height="67" alt="image" src="https://github.com/user-attachments/assets/38eb2a01-2f05-4653-b5bb-bf051fc9d032" /> <br>

<br>

**7. Lihat Daftar Sold Out**

Sama dengan lihat barang, tapi sumber datanya soldOut. Jika memang ada barang yang telah dipindahkan ke daftar ini, maka semuanya akan ditampilkan secara berurutan.

Contoh tampilan:

<img width="918" height="206" alt="image" src="https://github.com/user-attachments/assets/1c4b1e79-3c6e-4e91-9997-8162d65ba067" />


Namun, jika belum ada satupun barang yang terjual, pengguna akan mendapatkan pesan khusus bahwa daftar sold out masih kosong.

<img width="554" height="58" alt="image" src="https://github.com/user-attachments/assets/4ae1358f-1d4a-450c-99f6-a5324130636c" /> <br>

<br>

**8. Cari Barang (Search)**

Pengguna dapat mencari barang berdasarkan nama. Program menampilkan barang yang sesuai dengan kata kunci pencarian.
dengan cara, user memasukkan kata kunci, program cek setiap 

<img width="607" height="184" alt="image" src="https://github.com/user-attachments/assets/1f7af31c-c402-4c8a-971b-44c22aaf2dcd" />

Jika ada tampil baris/hasilnya (bisa dalam format tabel atau satu-per-baris). 

<img width="662" height="83" alt="image" src="https://github.com/user-attachments/assets/7beed1eb-d63c-4521-b3a7-728d7c2ed3da" />

Jika tidak ada tampil pesan “barang tidak ditemukan”.

<img width="566" height="79" alt="image" src="https://github.com/user-attachments/assets/74db57d0-fa0e-4319-be0c-6819749b492c" /> <br>

<br>
 
**9. Buat Invoice**
Saat memilih buat invoice, sistem mengambil data barang yang sold out, 


lalu menampilkan daftar barang tersebut dalam format invoice: nomor invoice, rincian barang (nama, kategori, harga), dan total harga yang harus dibayar. 

<img width="917" height="535" alt="image" src="https://github.com/user-attachments/assets/11ec5746-a4c2-43ca-aeba-3207755a23c0" />

Invoice ini berfungsi sebagai bukti transaksi sederhana.

Namun, apabila ternyata belum ada barang yang sold out, maka sistem akan menampilkan pesan bahwa belum ada barang yang bisa di buatkan invoice.

<img width="627" height="132" alt="image" src="https://github.com/user-attachments/assets/8e491a50-b170-4527-9bda-40f4ad68fcc0" /> <br>
<br>

**10. Keluar Program**

Jika pengguna memilih keluar, program berhenti berjalan. Sebagai penutup, ditampilkan ucapan terima kasih:

<img width="831" height="362" alt="image" src="https://github.com/user-attachments/assets/ea422fc7-a0f3-4e29-95a8-d1c101ebdf6e" />


Loop berhenti dan program exit.


## Penjelasan letak penerapan Abstraction dan Polymorphism.

### Abstraction
- Penerapan abstraksi ada pada class Product yang berada di package model.
Class ini dijadikan superclass untuk menampung atribut dasar (nama, kategori, kondisi, harga) yang pasti dimiliki semua barang.

Konsep abstraksi terlihat di sini karena Product hanya mendefinisikan kerangka umum dari barang, tanpa peduli detail khususnya.

Lalu dibuat subclass Clothing dan Accessory (masih di package model) yang mengisi detail barang sesuai jenisnya.

Inilah penerapan abstraksi: pengguna program cukup mengenal “produk” secara umum, tapi sistem bisa membedakan jenis barang lewat turunan class.


### Overloading
- Ada di package service, class CRUD.

Method tambahBarang() dibuat dalam beberapa versi (misalnya tambahBarang(String nama, String kategori, double harga) dan versi lain yang menerima parameter berbeda).

Hal ini memperlihatkan method overloading, yaitu penggunaan nama method yang sama tetapi dengan parameter berbeda, agar program lebih fleksibel saat menambahkan data.

### Overriding
- Terjadi di package model, class Clothing dan Accessory.

<img width="974" height="298" alt="image" src="https://github.com/user-attachments/assets/b56cec7f-857d-4b54-9f05-527e3caba2e3" />

Keduanya meng-override method dari superclass Product (misalnya getKategori() atau toString()) supaya menampilkan informasi sesuai jenis barangnya.

Polymorphism ini memungkinkan program memperlakukan semua objek sebagai Product, tetapi hasil keluaran berbeda tergantung subclass yang dipanggil.


