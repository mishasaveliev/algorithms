import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    MyLinkedList<String> linkedList;

    @Before
    public void init() {
        linkedList = new MyLinkedList<>();
    }

    @Test
    public void hasNextTest() {
        assertEquals(false, linkedList.hasNext());
    }
    @Test
    public void hasNextAfterAdd() {
        linkedList.add("o");
        assertEquals(true, linkedList.hasNext());
    }

    @Test
    public void getNextTest() {
        assertEquals(null, linkedList.getNext());
    }

    @Test
    public void getNextAfterAdd() {
        linkedList.add("h");
        assertEquals("h", linkedList.getNext());
    }
}