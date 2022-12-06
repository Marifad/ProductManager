public class AlreadyExistsException extends RuntimeException {

    public AlreadyExistsException(Product product) {

        super("Element with id: " + product.getId() + " already exists");

    }
}
