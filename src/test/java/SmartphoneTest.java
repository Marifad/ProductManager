import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {

    Smartphone smartphone1 = new Smartphone(45, "Galaxy 12", 20_000, "Samsung");

    @Test
    public void shouldFindName() {
        boolean expected = true;
        boolean actual = smartphone1.matches("12");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotFindName() {
        boolean expected = false;
        boolean actual = smartphone1.matches("ProMax");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindManufacturer() {
        boolean expected = true;
        boolean actual = smartphone1.matches("Samsung");
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNotFindManufacturer() {
        boolean expected = false;
        boolean actual = smartphone1.matches("Apple");
        Assertions.assertEquals(expected, actual);

    }

}
