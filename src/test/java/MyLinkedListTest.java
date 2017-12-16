import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    MyLinkedList<Object> linkedList;

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
        linkedList.add(new Object());
        assertEquals(true, linkedList.hasNext());
    }
}