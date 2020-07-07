import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ItemTest {
    private static Item validItem;

    @BeforeEach
    public void mySetup() {
        validItem = new Item("Item 1", "Salut");

    }

    @Test
    void isValidNominalItemsTest() {
        assertTrue(validItem.isValid());
    }

    @Test
    void nameBlank() {
        validItem.setName("");
        assertFalse(validItem.isValid());
    }
    @Test
    void contentBlank(){
        validItem.setContent("");
        assertFalse(validItem.isValid());
    }


}
