import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

import static java.time.temporal.ChronoUnit.MINUTES;
import static org.junit.jupiter.api.Assertions.*;

class ToDoListServiceTest {
    private static ToDoListService todo;
    @BeforeEach
    public void mySetup() {
        todo = new ToDoListService();
    }

    @Test
    void isValidNominalTodoTest() {
        assertNotEquals(null,todo.canAddItem(new Item("azeza","azezae")));

    }
    @Test
    void alreadyIn(){
        todo.getListItem().add(new Item("Item1","zazaezaeze"));
        assertEquals(null,todo.canAddItem(new Item("Item1","azezae")));
    }
    @Test
    void addUnvalidItem(){
        assertEquals(null,todo.canAddItem(new Item("","azezae")));
    }
    @Test
    void addMoreThanTenItem(){
        for (int i = 0; i < 11;i++){
            todo.getListItem().add(new Item("item"+i,"content"+i));
        }
        assertEquals(null,todo.canAddItem(new Item("Content","DeTrop")));
    }
    @Test
    void addLessThanTenItem(){
        for (int i = 0; i < 10;i++){
            todo.getListItem().add(new Item("item"+i,"content"+i));
        }
        assertNotEquals(null,todo.canAddItem(new Item("Content","DeTrop")));
    }
//    @Test
//    void addBeforeThirtyMinutes(){
//        todo.getListItem().add(new Item("Item1","zazaezaeze"));
//        Item itemToAdd = new Item("Item2","zaezarr");
//        itemToAdd.setCreationDate(LocalDateTime.now().plusMinutes(50));
//        assertEquals(null,todo.canAddItem(itemToAdd));
//    }
}
