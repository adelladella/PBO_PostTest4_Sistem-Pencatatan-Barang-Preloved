package main;

import java.util.Scanner;
import service.CRUD;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CRUD crud = new CRUD();
        int pilihan;

        System.out.println("\n=========================================================");
        System.out.println("       Selamat Datang di The Second Chapter Store");
        System.out.println("    Solusi praktis untuk mencatat dan kelola barangmu!");
        System.out.println("=========================================================");

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Lihat Semua Barang");
            System.out.println("2. Tambah Barang");
            System.out.println("3. Update Barang");
            System.out.println("4. Hapus Barang (Sold Out)");
            System.out.println("5. Lihat Daftar Sold Out");
            System.out.println("6. Cari Barang");
            System.out.println("7. Buat Invoice");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1 -> crud.lihatBarang();
                case 2 -> crud.tambahBarang();
                case 3 -> crud.updateBarang();
                case 4 -> crud.hapusBarang();
                case 5 -> crud.lihatSoldOut();
                case 6 -> crud.cariBarang();
                case 7 -> crud.buatInvoice();   // ✅ method dari CRUD
                case 8 -> System.out.println("| YEYYY Terima kasih telah menggunakan program ini!!");
                default -> System.out.println("| Wadduh!! Pilihan tidak valid!");
            }
        } while (pilihan != 8);
    }
}
