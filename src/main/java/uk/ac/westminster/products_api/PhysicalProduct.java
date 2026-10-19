//A PhysicalProduct IS-A product because every physical product still has an id, name and price.
//An order would not pass this test: Order is not a Product, it has Products

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {return weightKg;}
    public String getDimensions() {return dimensions;}
}
