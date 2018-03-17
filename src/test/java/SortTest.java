import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortTest {
    @Test
    public void compareThreeElements(){
        Node<Integer> head=new Node<>();
        head.item=3;
        head.next=new Node<Integer>();
        head.next.item=4;
        head.next.next=new Node<Integer>();
        head.next.next.item=1;

        Node<Integer> expectedHead=new Node<>();
        expectedHead.item=3;
        expectedHead.next=new Node<Integer>();
        expectedHead.next.item=4;
        expectedHead.next.next=new Node<Integer>();
        expectedHead.next.next.item=1;
        assertEquals(SortLinkedList.isEqualTo(head,expectedHead),true);
    }

    @Test
    public void compareLinkedListsThatAreNotEqual(){
        Node<Integer> head=new Node<>();
        head.item=3;
        head.next=new Node<Integer>();
        head.next.item=4;
        head.next.next=new Node<Integer>();
        head.next.next.item=1;

        Node<Integer> expectedHead=new Node<>();
        expectedHead.item=1;
        expectedHead.next=new Node<Integer>();
        expectedHead.next.item=3;
        expectedHead.next.next=new Node<Integer>();
        expectedHead.next.next.item=4;
        assertEquals(SortLinkedList.isEqualTo(head,expectedHead),false);
    }

    @Test
    public void sortThreeElements(){
        Node<Integer> unsortedLinkedList=new Node<>();
        unsortedLinkedList.item=3;
        unsortedLinkedList.next=new Node<Integer>();
        unsortedLinkedList.next.item=4;
        unsortedLinkedList.next.next=new Node<Integer>();
        unsortedLinkedList.next.next.item=1;

        Node<Integer> expectedHead=new Node<>();
        expectedHead.item=1;
        expectedHead.next=new Node<Integer>();
        expectedHead.next.item=3;
        expectedHead.next.next=new Node<Integer>();
        expectedHead.next.next.item=4;
        Node<Integer> sortedLinkedList = SortLinkedList.sort(unsortedLinkedList);
        assertEquals(SortLinkedList.isEqualTo(sortedLinkedList,expectedHead),true);
    }

    @Test
    public void checkIfUnsortedLinkedListIsSorted(){
        Node<Integer> unsortedLinkedList=new Node<>();
        unsortedLinkedList.item=3;
        unsortedLinkedList.next=new Node<Integer>();
        unsortedLinkedList.next.item=4;
        unsortedLinkedList.next.next=new Node<Integer>();
        unsortedLinkedList.next.next.item=1;
        assertEquals(SortLinkedList.isSorted(unsortedLinkedList),false);
    }

    @Test
    public void checkIfSortedLinkedListIsSorted(){
        Node<Integer> sortedLinkedList=new Node<>();
        sortedLinkedList.item=1;
        sortedLinkedList.next=new Node<Integer>();
        sortedLinkedList.next.item=3;
        sortedLinkedList.next.next=new Node<Integer>();
        sortedLinkedList.next.next.item=4;
        assertEquals(true, SortLinkedList.isSorted(sortedLinkedList));
    }

    @Test
    public void sortFiveElements(){
        Node<Integer> unsortedLinkedList=new Node<>();
        unsortedLinkedList.item=5;
        unsortedLinkedList.next=new Node<Integer>();
        unsortedLinkedList.next.item=4;
        unsortedLinkedList.next.next=new Node<Integer>();
        unsortedLinkedList.next.next.item=3;
        unsortedLinkedList.next.next.next=new Node<Integer>();
        unsortedLinkedList.next.next.next.item=2;
        unsortedLinkedList.next.next.next.next=new Node<Integer>();
        unsortedLinkedList.next.next.next.next.item=3;

        Node<Integer> expectedHead=new Node<>();
        expectedHead.item=2;
        expectedHead.next=new Node<Integer>();
        expectedHead.next.item=3;
        expectedHead.next.next=new Node<Integer>();
        expectedHead.next.next.item=3;
        expectedHead.next.next.next=new Node<Integer>();
        expectedHead.next.next.next.item=4;
        expectedHead.next.next.next.next=new Node<Integer>();
        expectedHead.next.next.next.next.item=5;
        Node<Integer> sortedLinkedList = SortLinkedList.sort(unsortedLinkedList);
        assertEquals(SortLinkedList.isEqualTo(sortedLinkedList,expectedHead),true);
        assertEquals(SortLinkedList.isSorted(sortedLinkedList),true);
    }

}
