package eshop;

public class PhysicalProduct extends Product{

    public PhysicalProduct() {
    }

    public PhysicalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    public void processOrder() {
        System.out.println("Balím " + getName() + " a posielam kuriérom.");
    }

}
