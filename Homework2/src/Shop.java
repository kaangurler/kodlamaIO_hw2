import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products;

    // Constructor
    public Shop(){
        setProducts(products);
    }

    // Setter and Getters
    public void setProducts(ArrayList<Product> products) {this.products = new ArrayList<>();}
    public ArrayList<Product> getProducts() {return products;}

    public void add(Product product){
        if (product.getName() != "" && product.getPrice() >= 0 && product.getStock() >= 0)
            products.add(product);
        else
            System.out.println("Product is invalid");
    }

    public void delete(int id){
        for (Product product: products) {
            if (product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }

    public Product search(String name){
        for (Product product: products){
            if (product.getName() == name){
                return product;
            }
        }
        return null;
    }

    public Product search(int id){
        for (Product product: products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }


    public void display(){
        for (Product product: products)
            System.out.println(product);
    }

    public boolean isIdUnique(int id){
        for (Product product: products) {
            if (id == product.getId()) {
                System.out.println("ID exists");
                return false;
            }
        }
        return true;
    }
}
