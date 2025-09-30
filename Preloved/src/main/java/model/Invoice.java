package model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private static int nomorInvoiceCounter = 1;
    private final int nomorInvoice;
    private final List<Product> daftarBarang;
    private final double totalHarga;

    // constructor
    public Invoice(List<Product> items) {
        this.nomorInvoice = nomorInvoiceCounter++;
        this.daftarBarang = new ArrayList<>(items);
        this.totalHarga = hitungTotal();
    }

    // hitung total harga
    private double hitungTotal() {
        double total = 0;
        for (Product p : daftarBarang) {
            total += p.getHarga();
        }
        return total;
    }

    // cetak invoice ke console
    public void cetakInvoice() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("\n========================================");
        System.out.println("           INVOICE PEMBELIAN            ");
        System.out.println("========================================");
        System.out.println("No. Invoice : " + nomorInvoice);
        System.out.println("----------------------------------------");

        for (int i = 0; i < daftarBarang.size(); i++) {
            Product p = daftarBarang.get(i);
            System.out.printf("%d. %s (%s - %s) - Rp.%s\n",
                    (i + 1),
                    p.getNama(),
                    p.getKategori(),
                    p.getKondisi(),
                    df.format(p.getHarga()));
        }

        System.out.println("----------------------------------------");
        System.out.println("Total Harga : Rp." + df.format(totalHarga));
        System.out.println("========================================\n");
    }
}
