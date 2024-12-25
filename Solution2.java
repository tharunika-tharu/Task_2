import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private int quantity;
    //constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    //getter methods
    public int getPid() {
        return pid;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
}
class XYZ {
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice()*product.getQuantity();
        }
        return totalAmount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        //accept five product information from user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
        //find Pid of the product with highest price
        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();
        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }
        System.out.println("Product ID with the highest price: "+highestPricePid);
        //calculate and display total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: "+totalAmount);
    }
}
