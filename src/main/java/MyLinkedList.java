public class MyLinkedList<Item>{
    Node node = new Node<Item>();
    public Item getNext(){
        if(hasNext()==false){
            return null;
        }
        return (Item) node.next.item;
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