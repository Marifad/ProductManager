import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    Book book1 = new Book(3, "Метель", 500, "Пушкин А.С.");
    Book book2 = new Book(4, "Станционный смотритель", 300, "Пушкин А.С.");
    Book book3 = new Book(10, "Госпожа Метелица", 120, "Братья Гримм");

    Smartphone smartphone1 = new Smartphone(45, "Galaxy 12", 20_000, "Samsung");


    @BeforeEach
    public void setup() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
    }


    @Test
    public void shouldAddProducts() {

        Product[] expected = {book1, book2, book3, smartphone1};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindTwoProducts() {

        Product[] actual = manager.searchBy("Метел");
        Product[] expected = {book1, book3};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindOneProduct() {

        Product[] actual = manager.searchBy("Galaxy");
        Product[] expected = {smartphone1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindZero() {

        Product[] actual = manager.searchBy("Мастер и Маргарита");
        Product[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }
}
