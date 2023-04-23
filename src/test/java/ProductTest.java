import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductTest {

    Product item1 = new Product(1, "Книга", 1500);
    Product item2 = new Product(2, "Сок", 130);
    Product item3 = new Product(3, "Кровать", 43330);

    ShopRepository repo = new ShopRepository();

    @Test
    public void testFindWithinId() {

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        Product [] expected = {item3};
        Product [] actual = new Product[]{repo.findById(3)};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindOverId() {

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        Product [] expected = {null};
        Product [] actual = new Product[]{repo.findById(4)};


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {

        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        Product[] expected = {item1, item2};
        Product[] actual = new Product[]{repo.removeById(3)};

        Assertions.assertArrayEquals(expected, actual);
    }
}
