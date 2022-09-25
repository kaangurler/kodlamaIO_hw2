public class Product {
    private String name;
    private double price;
    private int stock;
    private int id;

    // Constructor
    public Product(String name, double price, int stock, int id){
        setName(name);
        setPrice(price);
        setStock(stock);
        setId(id);
    }

    // Setter and Getters
    public void setName(String name) {
        if (name == "")
            this.name = "Unknown";
        else
            this.name = name;
    }
    public void setPrice(double price) {
        if (price <= 0)
            this.price = -1;
        else
            this.price = price;
    }
    public void setStock(int stock) {
        if (stock <= 0)
            this.stock = -1;
        else
            this.stock = stock;
    }
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getStock() {return stock;}
    public int getId() {return id;}

    @Override
    public String toString(){
        return "ID: " + this.getId() + " - Name: " + this.getName() + " - Price: $" + this.getPrice() + " - Stock: " + this.getStock();
    }
}
