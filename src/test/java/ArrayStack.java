public class ArrayStack<Item> implements MyStack<Item> {
    Item item;
    Object[] objects = new Object[1];
    int index = 0;
    public void push(Item item) {
        if(objects.length==index){
            growArray();
        }
        objects[index++]=item;
    }
    public Item pop(){
        if(isEmpty()){
            return null;
        }

        return (Item) objects[--index];
    }
    public boolean isEmpty(){
        if(index==0){
            return true;
        }
        else{
            return false;
        }

    }
    private void growArray(){
        Object[] biggerArray = new Object[objects.length*2];
        for(int i=0; i<objects.length; i++){
            biggerArray[i]=objects[i];
        }
        objects=biggerArray;
    }
}
