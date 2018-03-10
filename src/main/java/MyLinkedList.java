public class MyLinkedList<Item>{
    Node getNode = new Node<>();
    Node addNode = getNode;
    public Item getNext(){
        if(hasNext()==false){
            return null;
        }
        getNode = getNode.next;
        return (Item) getNode.item;
    }
    public void add(Comparable item){
        addNode.next = new Node<>();
        addNode.next.item = item;
        addNode = addNode.next;
    }
    public void remove(Item itemToRemove){
        getNode.next=getNode.next.next;

    }
    public boolean hasNext(){
        if(getNode.next==null){
            return false;
        }
        else{
            return true;
        }
    }
}