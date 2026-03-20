import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void testInsertAndSearchFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        Association<String, String> a1 = new Association<>("dog", "perro");
        Association<String, String> a2 = new Association<>("house", "casa");
        Association<String, String> a3 = new Association<>("cat", "gato");

        tree.insert(a1);
        tree.insert(a2);
        tree.insert(a3);

        Association<String, String> result = tree.search(new Association<>("house", ""));

        assertNotNull(result);
        assertEquals("casa", result.getValue());
    }

    @Test
    public void testSearchNotFound() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("dog", "perro"));

        Association<String, String> result = tree.search(new Association<>("cat", ""));

        assertNull(result);
    }

    @Test
    public void testInsertMultipleAndSearch() {
        BinaryTree<Association<String, String>> tree = new BinaryTree<>();

        tree.insert(new Association<>("mango", "mango"));
        tree.insert(new Association<>("apple", "manzana"));
        tree.insert(new Association<>("zebra", "cebra"));

        Association<String, String> result1 = tree.search(new Association<>("apple", ""));
        Association<String, String> result2 = tree.search(new Association<>("zebra", ""));

        assertEquals("manzana", result1.getValue());
        assertEquals("cebra", result2.getValue());
    }
}