import java.util.ArrayList;

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
                throw new ProductNotFoundException("Product Inventory is 0");
            }
            else {
                for (Product product : productList) {

                    if (product.getId().equals(id)) {
                        productList.remove(product);
                        System.out.println("Product Removed");
                    }
                }
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

