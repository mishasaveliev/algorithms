public class MyLinkedList<Item>{
    Node<Item> node = new Node<>();
    public Node getNext(){
        return new Node<Item>();

    }
    public void add(Item item){
        node.next = new Node<>();
        node.next.item = item;
    }
    public boolean hasNext(){
        if(node.next==null){
            return false;
        }
        else{
            return true;
        }
    }
}