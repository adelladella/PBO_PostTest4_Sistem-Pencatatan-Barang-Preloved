package model;

public class Accessory extends Product {
    public Accessory(String nama, String kategori, String kondisi, double harga) {
        super(nama, kategori, kondisi, harga);
    }

    @Override
    public String toString() {
        return "[Accessory] " + super.toString();
    }
}
