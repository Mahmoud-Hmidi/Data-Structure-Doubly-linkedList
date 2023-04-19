public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        DoublyLinkedList<Integer> dl=new DoublyLinkedList<>();
        dl.add_haed(10);
        dl.add_haed(20);
        dl.add_haed(30);
        dl.add_tail(50);
        dl.print_data_head();
        System.out.println();
        System.out.println("****************");
        dl.print_data_tail();
        System.out.println();
        System.out.println("*****************");
        dl.remove_head();
        dl.print_data_head();
        System.out.println();
        System.out.println("******************");
        dl.remove_tail();
        dl.print_data_head();
        System.out.println();
        System.out.println("*******************");
        boolean status=dl.isEmpty();
        System.out.println(status);
    }// end function main ()
}// end class Main