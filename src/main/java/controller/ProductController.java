package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final ProductService productService = new ProductServiceImpl();

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public Product searchProductByUuid(String uuid) {
        return productService.searchProductByUuid(uuid);
    }
}
