package linkedList;

public class insertion {
    public static void main(String[] args) {
        insertion list = new insertion();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(33, 3);
        list.display();
    }
//step-2 Create head and tail and initial size of LL is zero.
    private Node head;
    private Node tail;

    private int size;
    public insertion() {
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
//Step-5 for insertion at the end of the linkedlist
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
//Step-6 for insertion at the particular index
    public void insert(int val, int index){
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node= new Node(val, temp.next);
        temp.next=node;
        size++;
    } 

//Step-4 display function
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
        public Node(int value, Node next){   //contructor
            this.value=value;
            this.next=next;
        }
    } 
}