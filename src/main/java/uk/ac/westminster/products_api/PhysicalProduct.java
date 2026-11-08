//A PhysicalProduct IS-A product because every physical product still has an id, name and price.
//An order would not pass this test: Order is not a Product, it has Products

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {}
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    public String getSummary() {
        return "Physical: " + getName() + " | " + weightKg + "kg";
    }
    public double getWeightKg() {return weightKg;}
    public String getDimensions() {return dimensions;}

    public void setWeightKg(double weightKg) {this.weightKg = weightKg;}
    public void setDimensions(String dimensions) {this.dimensions = dimensions;}

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
