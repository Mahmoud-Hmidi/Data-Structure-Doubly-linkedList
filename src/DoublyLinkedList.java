
public class DoublyLinkedList<T> {
   private class  Node<T>{
        Node next;
        Node previous;
        T item;
        public  Node(T newItem){
            item=newItem;
        }// end counstractor
    }// end class Node
    Node head;
    Node tail;
    int size=0;
    public DoublyLinkedList(){

    }// counstrator

    public  void add_haed(T item){
        Node new_node=new Node<>(item);
        if (head==null){
            head=tail=new_node;
        }// end if
        else {
            new_node.next=head;
            head.previous=new_node;
            head=new_node;
        }// end else
        size++;
    }// end function add_haed()


    public void add_tail(T item){
        Node new_node=new Node<>(item);
        if (tail==null){
            tail=head=new_node;
        }// end if
        else {
            new_node.previous=tail;
            tail.next=new_node;
            tail=new_node;
        }//end else
    }// end function add_tail()

    public void remove_head(){
       head=head.next;
        size--;
    }// end function remove_head ()
    public void remove_tail(){
        tail=tail.previous;
        tail.next=null;
        size--;
    }// end function remove_tail()
    public boolean isEmpty(){
        if (head==null){
            return true;
        }else {
            return false;
        }
    }// end function isEmpty ()

    public void print_data_head(){
        Node current=head;
        while (current!=null){
            System.out.print(" "+current.item);
            current=current.next;
        }//end while loop
    }// end function print_data()

    public void print_data_tail(){
        Node current=tail;
        while (current!=null){
            System.out.print(" "+current.item);
            current=current.previous;
        }// end while loop
    }// end function print_data_tail ()

}// end class DoublyLinkedList
