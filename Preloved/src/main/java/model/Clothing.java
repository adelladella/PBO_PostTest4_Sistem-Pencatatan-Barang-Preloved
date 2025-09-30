package model;

public class Clothing extends Product {
    public Clothing(String nama, String kategori, String kondisi, double harga) {
        super(nama, kategori, kondisi, harga);
    }

    @Override
    public String toString() {
        return "[Clothing] " + super.toString();
    }
}
