public class MyStack<Item> {
    private Node first = null;
    public boolean isEmpty() {
        if(first==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(Item item){
        if(first == null) {
            first = new Node<>();
            first.item=item;
        }
        else{
            Node newNode = new Node<>();
            newNode.item = item;

            newNode.next=first;
            first = newNode;

        }
    }
    public Item pop() {
        if(first != null) {
            Item toReturn = (Item) first.item;
            first = first.next;
            return toReturn;

        }

        return null;

    }
}
