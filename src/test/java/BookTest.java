import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    Book book2 = new Book(4, "Станционный смотритель", 300, "Пушкин А.С.");

    @Test
    public void shouldFindName() {
        boolean expected = true;
        boolean actual = book2.matches("смотритель");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotFindName() {
        boolean expected = false;
        boolean actual = book2.matches("метель");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindManufacturer() {
        boolean expected = true;
        boolean actual = book2.matches("Пушкин");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotFindManufacturer() {
        boolean expected = false;
        boolean actual = book2.matches("Блок");
        Assertions.assertEquals(expected, actual);

    }

}
