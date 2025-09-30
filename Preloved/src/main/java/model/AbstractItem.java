package model;

// Abstract Class -> Abstraction
public abstract class AbstractItem {
    public abstract String getBrief();

    public void printInfo() {
        System.out.println("Ini adalah item dari toko preloved.");
    }
}
