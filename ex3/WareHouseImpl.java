package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WareHouseImpl implements Warehouse {

    private final LinkedHashSet<Product> productSet;
    
    public WareHouseImpl() {
        this.productSet = new LinkedHashSet<Product>();
    }

    public void addProduct(Product p) {
        this.productSet.add(p);
    }

    public Set<String> allNames() {
        Set<String> productsName = new TreeSet<>();
        for(Product p : this.productSet) {
            productsName.add(p.getName());
        }
        return productsName;
    }

    public Set<Product> allProducts() {
        return new LinkedHashSet<>(this.productSet);
    }

    public boolean containsProduct(Product p) {
        return this.productSet.contains(p);
    }

    public double getQuantity(String name) {
        var it = this.productSet.iterator();
        while(it.hasNext()) {
            var product = it.next();
            if(product.getName() == name) {
                return product.getQuantity();
            }
        }
        return -1;
    }

    public String toString() {
        return "WareHouseImpl [productSet=" + this.productSet + "]";
    }
}
