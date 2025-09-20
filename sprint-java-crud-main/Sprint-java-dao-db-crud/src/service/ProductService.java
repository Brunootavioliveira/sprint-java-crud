package service;

import dao.ProductDAO;
import model.Product;
import java.util.List;

public class ProductService {
    private ProductDAO productDAO = new ProductDAO();

    public void addProduct(Product product) {
        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("O preço deve ser positivo");
        }
        productDAO.create(product);
    }

    public List<Product> listProducts() {
        return productDAO.readAll();
    }

    public void updateProduct(Product product) {
        productDAO.update(product);
    }

    public void deleteProduct(int id) {
        productDAO.delete(id);
    }
}
