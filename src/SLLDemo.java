public class SLLDemo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedList1 list1 = new SingleLinkedList1();

//        list.insertAtBeginning(9);
//        list.insertAtBeginning(7);
//        list.display();
//        System.out.println();
//        list.deleteAtPos(1);
//        list.display();
        list1.insertAtBeginning(9);
        list1.insertAtBeginning(4);
        list1.insertAtBeginning(3);
        list1.insertAtBeginning(2);
        list1.display();
        System.out.println();
        list1.search(2);
        System.out.println();
        list1.contains(9);



    }
}
