package eshop;

public class DigitalProduct extends Product {

    public DigitalProduct() {
    }

    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void processOrder() {
        System.out.println("Generujem link na stiahnutie pre " + getName());
    }
}
