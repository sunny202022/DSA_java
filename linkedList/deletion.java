package linkedList;
public class deletion {
    public static void main(String[] args) {
        deletion list = new deletion();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.delete(2);
        list.display();
        // list.insertLast(99);
        // list.insert(33, 3);
        System.out.println(list.deleteFirst());
        list.display();

    }
    private Node head;
    private Node tail;

    private int size;
    public deletion() {
        this.size=0;
    }
// Step -3 insertion in a linkedlist at first poistion
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
//Step -4 deletion
    public int deleteFirst(){
        int val = head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
    }
//Step-5 deletion from last
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

// finding index for given value
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return node;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
// index vaalue deletion
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index== size-1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        
        prev.next = prev.next.next;

        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
// step-1 create a node and next 
    private class Node{
        private int value;
        private Node next;

        public Node(int value){  //constructor
            this.value=value;
        }
        // public Node(int value, Node next){   //contructor
        //     this.value=value;
        //     this.next=next;
        //}
    } 
}
