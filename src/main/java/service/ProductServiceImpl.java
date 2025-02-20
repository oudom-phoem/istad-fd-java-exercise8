package service;

import model.Product;
import repsoitory.ProductRepository;

import java.util.List;
import java.util.NoSuchElementException;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAllProducts() {
        return productRepository.products;
    }

    @Override
    public Product searchProductByUuid(String uuid) {
        List<Product> filteredProducts = productRepository.products.stream()
                .filter(product -> product.getUuid().equals(uuid))
                .toList();

        if (filteredProducts.isEmpty()) {
            throw new NoSuchElementException("No product found with UUID: " + uuid);
        }

        return filteredProducts.get(0);
    }
}
