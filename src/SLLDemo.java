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
        list1.insertAtBeginning(5);
        list1.insertAtBeginning(3);
        list1.insertAtBeginning(2);
        list1.display();
        System.out.println();
        list1.deleteAtEnd();
        list1.display();
        System.out.println();
        list1.insertAtEnd(4);
        list1.display();
        System.out.println();
        list1.insertAtEnd(99);
        list1.display();



    }
}
