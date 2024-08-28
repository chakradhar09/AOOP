package Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManager {
    private final List<IProduct> products;

    public ProductManager(){
        this.products = new ArrayList<>();
    }

    public boolean isEmpty(){
        return !products.isEmpty();
    }
    public boolean isProduct(String productId){
        for(IProduct product: products){
            if(Objects.equals(productId, product.getProductId()))
                return true;
        }
        return false;
    }
    private IProduct getProduct(String productId){
        for(IProduct product: products){
            if(Objects.equals(productId, product.getProductId()))
                return product;
        }
        return null;
    }

    public boolean addProduct(IProduct product){
        return products.add(product);
    }
    public boolean removeProduct(String productId){
        return products.remove(getProduct(productId));
    }
    public void view(){
        for(IProduct product: products)
            System.out.println(product);
    }
}
