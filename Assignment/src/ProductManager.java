import java.util.ArrayList;
import java.util.Iterator;


public class ProductManager {
    private ArrayList<Product> productList = new ArrayList<>();



    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        try {
            if (product.getPrice() < 0) {
                throw new IllegalArgumentException("Price can't be negative");
            }

            productList.add(product);

        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    public void removeProduct(String id) {
        try {
            if (productList.isEmpty()) {
                throw new ProductNotFoundException("Product Inventory is empty");
            }

            Iterator<Product> iterator = productList.iterator();
            boolean found = false;

            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.getId().equals(id)) {
                    iterator.remove();
                    found = true;
                    System.out.println("Product removed.");
                    break; // Exit the loop once the product is removed
                }
            }

            if (!found) {
                throw new ProductNotFoundException("Product with ID " + id + " not found.");
            }

        } catch (ProductNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


      /*  try {
            if (productList.isEmpty()) {
                throw new ProductNotFoundException("Product Inventory is 0");
            }
            if (productList.contains(product)) {
                productList.remove(product);
            }
        } catch (ProductNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } */


    public void updateProduct(Product product) {
        try {
            if (productList.isEmpty()) {
                throw new ProductNotFoundException("Product Inventory is 0");
            }
            for (int i = 0; i < productList.size(); i++) {
                if (productList.contains(product)) {
                    productList.set(i, product);
                }

            }
        } catch (ProductNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public void showProduct() {
        try {
            if (productList.isEmpty()) {
                throw new ProductNotFoundException("Product Inventory is 0");
            }  }catch (ProductNotFoundException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        System.out.println(productList);
    }

    public void findProductById(String id) {
        try {
            if (!productList.contains(id)) {
                throw new ProductNotFoundException("Product not found");
            }
            for (Product product : productList) {
                if (product.getId().equals(id)) {
                    System.out.println(product);
                }
            }
        } catch (ProductNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

