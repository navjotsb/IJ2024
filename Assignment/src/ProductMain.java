import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        String id;
        String productName;
        Double price;
        int quantity;
        boolean exit = false;
        String cont;

        ProductManager productManager = new ProductManager();


        Scanner scanner = new Scanner(System.in);

        while (exit != true) {

            System.out.println("Welcome to Inventory Management System");
            System.out.println("Press 1 to add a product");
            System.out.println("Press 2 to remove a product");
            System.out.println("Press 3 to update a product");
            System.out.println("Press 4 to search product by ID");
            System.out.println("Press 5 to view all product");
            System.out.println("Press 6 to exit");

            int option;

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the ID of the product");
                    id = scanner.nextLine();

                    System.out.println("Enter the name of the product");
                    productName = scanner.nextLine();

                    System.out.println("Enter the price of the product");
                    price = scanner.nextDouble();

                    System.out.println("Enter the quantity of the product");
                    quantity = scanner.nextInt();


                    productManager.addProduct(new Product(id, productName, price, quantity));
                    productManager.showProduct();

                    System.out.println("Press y to exit or any key to continue ");

                    return;

                case 2:
                    System.out.println("Enter the ID of the product to remove");
                    id = scanner.nextLine();

               /* System.out.println("Enter the name of the product to remove");
                productName= scanner.nextLine();

                System.out.println("Enter the price of the product to remove");
                price= scanner.nextDouble();

                System.out.println("Enter the quantity of the product to remove");
                quantity= scanner.nextInt(); */


                    productManager.removeProduct(id);
            }
        }
    }
}
