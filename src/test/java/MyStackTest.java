import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    MyStack<String> myStack1;

    @Before
    public void setUp() throws Exception {
        myStack1 = new MyStack<>();
    }

    @Test
    public void isEmpty() {
        assertEquals(true, myStack1.isEmpty());
    }

    @Test
    public void push() {
        myStack1.push("H");
        assertEquals(false, myStack1.isEmpty());
    }

    @Test
    public void pop() {
        assertEquals(null, myStack1.pop());
    }

    @Test
    public void popNotEmpty() {
        myStack1.push("H");
        assertEquals("H", myStack1.pop());
    }

    @Test
    public void twoItems() {
        myStack1.push("a");
        myStack1.push("b");
        assertEquals("b", myStack1.pop());
        assertEquals("a", myStack1.pop());
    }
}