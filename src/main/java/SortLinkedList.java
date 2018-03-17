public class SortLinkedList {
    public static Node sort(Node head){
        Node oldHead=head;
        int sortedCount=1;
        while(sortedCount!=0){
            sortedCount=0;
            while(head.next!=null){
                if(head.item.compareTo(head.next.item)>0){
                    Comparable tempItem=head.next.item;
                    head.next.item=head.item;
                    head.item=tempItem;
                    sortedCount++;
                }
                head=head.next;
            }
            head=oldHead;

        }
        return head;
    }
    public static boolean isEqualTo(Node headA, Node headB){
        if(!headA.next.item.equals(headB.next.item)){
            return false;
        }
        while(headA.next!=null && headB.next!=null){
            if(!headA.item.equals(headB.item)){
                return false;
            }
            headA=headA.next;
            headB=headB.next;
        }
        if(headA.next!=null || headB.next!=null){
            return false;
        }
        return true;
    }
    public static boolean isSorted(Node head) {
        while (head.next != null) {
            if (head.item.compareTo(head.next.item) > 0) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}