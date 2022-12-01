import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product product1 = new Product(3, "Брюки", 500);
    Product product2 = new Product(4, "Долгая дорога", 300);
    Product product3 = new Product(10, "Платье", 950);



    @Test
    public void shouldSave() {

        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        Product[] expected = {product1, product2};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveById() {

        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.removeById(4);
        Product[] expected = {product1, product3};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveAllById() {

        ProductRepository repo = new ProductRepository();
        repo.save(product1);
        repo.save(product2);
        repo.save(product3);
        repo.removeById(3);
        repo.removeById(4);
        repo.removeById(10);
        Product[] expected = {};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }
}
