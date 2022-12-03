import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    Product book3 = new Book(10, "Госпожа Метелица", 120, "Братья Гримм");

    @Test
    public void shouldMatch() {
        boolean expected = true;
        boolean actual = book3.matches("Госпожа");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMatch() {

        boolean expected = false;
        boolean actual = book3.matches("Смотритель");
        Assertions.assertEquals(expected, actual);
    }
}
