public class ProductRepository {
    private Product[] products = new Product[0];

    public void save(Product product) {
        int id = product.getId();

        if (findById(id) != null) {
            throw new AlreadyExistsException(product);
        }
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }

        tmp[tmp.length - 1] = product;
        products = tmp;

    }


    public Product[] getItems() {

        return products;
    }

    public Product findById(int id) {

        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;

    }

    public void removeById(int id) {

        if (findById(id) == null) {
            throw new NotFoundException(id);
        }
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product item : products) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        products = tmp;
    }

}