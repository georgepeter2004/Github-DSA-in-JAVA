public class SLLDemo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        SingleLinkedList1<String> list1 = new SingleLinkedList1<String>();

//        list.insertAtBeginning(9);
//        list.insertAtBeginning(7);
//        list.display();
//        System.out.println();
//        list.deleteAtPos(1);
//        list.display();
        list1.insertAtBeginning("Peter");
        list1.insertAtBeginning("Mugesh");
        list1.insertAtBeginning("bala");
        list1.insertAtBeginning("Karthi");
        list1.display();
        System.out.println();
        list1.search("Peter");
        System.out.println();
        list1.contains("Mugesh");
        list1.get(3);



    }
}
