package repsoitory;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductRepository {
    public List<Product> products = new ArrayList<>(
            List.of(new Product(1, UUID.randomUUID().toString(), "Coca"),
                    new Product(2, UUID.randomUUID().toString(), "Pepsi"))
    );
}
