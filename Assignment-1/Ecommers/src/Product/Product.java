package Product;

public abstract class Product implements IProduct {
    private String productName;
    private String productId;

    public String getProductId(){
        return productId;
    }

    public void setProductId(String productId){
        this.productId = productId;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }

    public String toString(){
        return "\nProduct ID: " + productId + '\n' +
                "Product Name: " + productName;
    }
}
