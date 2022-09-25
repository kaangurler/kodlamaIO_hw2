import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        int choice1 = -1;

        // Program Menu
        do {
            System.out.println("*****Shop*****");
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Display");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    String name;
                    double price;
                    int stock, id;
                    System.out.println("---Add Product---");
                    System.out.print("Name: ");
                    name = scanner.next();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    System.out.print("Stock: ");
                    stock = scanner.nextInt();
                    do {
                        System.out.print("ID (Unique): ");
                        id = scanner.nextInt();
                    }while (!shop.isIdUnique(id));
                    shop.add(new Product(name, price, stock, id));
                    break;
                case 2:
                    System.out.println("Search for the product");
                    System.out.print("Search by ID(1)/Name(2): ");
                    int choice2 = scanner.nextInt();
                    Product searchedProduct;
                    switch (choice2){
                        case 1:
                            System.out.print("Enter ID: ");
                            searchedProduct = shop.search(scanner.nextInt());
                            if (searchedProduct != null){
                                System.out.println(searchedProduct);
                            }
                            else {
                                System.out.println("Product does not exist");
                            }
                            break;
                        case 2:
                            System.out.print("Enter name: ");
                            searchedProduct = shop.search(scanner.next());
                            if (searchedProduct != null){
                                System.out.println(searchedProduct);
                            }
                            else {
                                System.out.println("Product does not exist");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Display products");
                    shop.display();
                    break;
                case 4:
                    System.out.print("Delete product (Enter product ID): ");
                    shop.delete(scanner.nextInt());
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }while (!exit);
    }
}
