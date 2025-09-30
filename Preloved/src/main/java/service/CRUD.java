package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class CRUD {
    private final ArrayList<Product> barang = new ArrayList<>();
    private final ArrayList<Product> soldOut = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    // constructor data awal
    public CRUD() {
        barang.add(new Clothing("Blouse Motif Bunga", "Baju", "Second", 70000));
        barang.add(new Clothing("Kemeja Kotak-Kotak Flanel", "Baju", "Second", 75000));
        barang.add(new Clothing("Crop Top Polos", "Baju", "Second", 50000));
        barang.add(new Clothing("Celana Jeans Skinny", "Celana", "Second", 120000));
        barang.add(new Clothing("Rok Span Hitam", "Rok", "New", 60000));
        barang.add(new Clothing("Jaket Denim", "Jaket", "Second", 130000));
        barang.add(new Accessory("Totebag Kanvas", "Tas", "Second", 50000));
        barang.add(new Accessory("Pin Hijab", "Aksesoris", "New", 15000));
        barang.add(new Accessory("Kacamata Frame Kotak", "Aksesoris", "New", 100000));
    }

    // tambah barang
    public void tambahBarang() {
        System.out.print("Masukkan nama barang: ");
        String nama = input.nextLine();
        System.out.print("Masukkan kategori: ");
        String kategori = input.nextLine();
        System.out.print("Masukkan kondisi (New/Second): ");
        String kondisi = input.nextLine();
        System.out.print("Masukkan harga (contoh 7500): Rp. ");
        double harga = input.nextDouble();
        input.nextLine();

        Product newProduct;
        if (kategori.equalsIgnoreCase("Baju") || kategori.equalsIgnoreCase("Celana")
                || kategori.equalsIgnoreCase("Rok") || kategori.equalsIgnoreCase("Jaket")) {
            newProduct = new Clothing(nama, kategori, kondisi, harga);
        } else {
            newProduct = new Accessory(nama, kategori, kondisi, harga);
        }

        barang.add(newProduct);
        System.out.println("| Yeyyy barang berhasil ditambahkan!");
    }

    // lihat barang
    public void lihatBarang() {
        if (barang.isEmpty()) {
            System.out.println("| Yahh belum ada barang yang tersedia..");
        } else {
            System.out.println("\n===== Daftar Barang =====");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n",
                    "No", "Nama", "Kategori", "Kondisi", "Harga");
            System.out.println("-------------------------------------------------------------------------------");

            for (int i = 0; i < barang.size(); i++) {
                Product p = barang.get(i);
                System.out.printf("| %-3d | %-25s | %-15s | %-10s | Rp.%-10s |\n",
                        (i + 1), p.getNama(), p.getKategori(),
                        p.getKondisi(), String.format("%,.0f", p.getHarga()));
            }
            System.out.println("-------------------------------------------------------------------------------\n");
        }
    }

    // update barang
    public void updateBarang() {
        lihatBarang();
        if (barang.isEmpty()) return;

        System.out.print("| Pilih nomor barang yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();
        if (index > 0 && index <= barang.size()) {
            System.out.print("Masukkan nama baru: ");
            String nama = input.nextLine();
            System.out.print("Masukkan kategori baru: ");
            String kategori = input.nextLine();
            System.out.print("Masukkan kondisi baru (New/Second): ");
            String kondisi = input.nextLine();
            System.out.print("Masukkan harga baru: Rp. ");
            double harga = input.nextDouble();
            input.nextLine();

            Product updated;
            if (kategori.equalsIgnoreCase("Baju") || kategori.equalsIgnoreCase("Celana")
                    || kategori.equalsIgnoreCase("Rok") || kategori.equalsIgnoreCase("Jaket")) {
                updated = new Clothing(nama, kategori, kondisi, harga);
            } else {
                updated = new Accessory(nama, kategori, kondisi, harga);
            }

            barang.set(index - 1, updated);
            System.out.println("| Uyeyyy barang berhasil diupdate!");
        } else {
            System.out.println("| Nah! nomor tidak valid!!");
        }
    }

    // hapus barang
    public void hapusBarang() {
        lihatBarang();
        if (barang.isEmpty()) return;

        System.out.print("| Pilih nomor barang yang ingin dihapus (sold out): ");
        int index = input.nextInt();
        input.nextLine();

        if (index > 0 && index <= barang.size()) {
            Product p = barang.remove(index - 1);
            soldOut.add(p);
            System.out.println("| Keren! Barang berhasil dipindahkan ke daftar Sold Out!");
        } else {
            System.out.println("| Yahh nomor tidak valid..");
        }
    }

    // lihat sold out
    public void lihatSoldOut() {
        if (soldOut.isEmpty()) {
            System.out.println("| Sayang banget! Belum ada barang yang sold out!!");
        } else {
            System.out.println("\n===== Daftar Sold Out =====");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-12s |\n",
                    "No", "Nama", "Kategori", "Kondisi", "Harga");
            System.out.println("-------------------------------------------------------------------------------");

            for (int i = 0; i < soldOut.size(); i++) {
                Product p = soldOut.get(i);
                System.out.printf("| %-3d | %-25s | %-15s | %-10s | Rp.%-10s |\n",
                        (i + 1), p.getNama(), p.getKategori(),
                        p.getKondisi(), String.format("%,.0f", p.getHarga()));
            }
            System.out.println("-------------------------------------------------------------------------------\n");
        }
    }

    // cari barang
    public void cariBarang() {
        System.out.print("| Masukkan nama barang yang ingin dicari: ");
        String keyword = input.nextLine().toLowerCase();

        boolean ditemukan = false;
        for (Product p : barang) {
            if (p.getNama().toLowerCase().contains(keyword)) {
                System.out.println("| Ditemukan: " + p);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("| Huhuhuu, barang tidak ditemukan..");
        }
    }

    // laporan
    public void tampilkanLaporan() {
        System.out.println("===== LAPORAN BARANG =====");
        for (Product p : barang) {
            System.out.println(p.generateReport()); // Polymorphism interface
        }
    }

    // buat invoice dari barang sold out
    public void buatInvoice() {
        lihatSoldOut(); // tampilkan daftar sold out
        if (soldOut.isEmpty()) {
            System.out.println("| Yahh belum ada barang sold out untuk dibuat invoice..");
            return;
        }

        // langsung buat invoice pakai daftar soldOut
        Invoice invoice = new Invoice(soldOut);
        invoice.cetakInvoice();
    }
}
