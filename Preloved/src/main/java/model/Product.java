package model;

import java.text.DecimalFormat;

public class Product extends AbstractItem implements Reportable {
    private String nama;
    private String kategori;
    private String kondisi;
    private double harga;

    public Product(String nama, String kategori, String kondisi, double harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.kondisi = kondisi;
        this.harga = harga;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String getKondisi() { return kondisi; }
    public void setKondisi(String kondisi) { this.kondisi = kondisi; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    @Override
    public String getBrief() {
        return nama + " | " + kategori;
    }

    @Override
    public String generateReport() {
        DecimalFormat df = new DecimalFormat("#,###");
        return "[REPORT] " + nama + " - Harga: Rp." + df.format(harga);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        return nama + " | " + kategori + " | " + kondisi + " | Rp." + df.format(harga);
    }
}
