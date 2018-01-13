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
    public void hasNextTestWhenEmpty() {
        assertEquals(false, linkedList.hasNext());
    }
    @Test
    public void hasNextAfterAdd() {
        linkedList.add("o");
        assertEquals(true, linkedList.hasNext());
    }

    @Test
    public void getNextTestWhenEmpty() {
        assertEquals(null, linkedList.getNext());
    }

    @Test
    public void getNextAfterThreeAdds() {
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        assertEquals("a", linkedList.getNext());
        assertEquals("b", linkedList.getNext());
        assertEquals("c", linkedList.getNext());
    }

    @Test
    public void getNextAfterThreeAddsMixedAddAndNext() {
        linkedList.add("a");
        assertEquals("a", linkedList.getNext());
        linkedList.add("b");
        assertEquals("b", linkedList.getNext());
        linkedList.add("c");
        assertEquals("c", linkedList.getNext());
    }

    @Test
    public void removingItem() {
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.remove("b");
        assertEquals("a", linkedList.getNext());
        assertEquals("c", linkedList.getNext());
    }

}