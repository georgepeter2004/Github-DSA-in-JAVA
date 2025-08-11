public class SLLDemo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.insertAtBeginning(9);
        list.insertAtBeginning(7);
        list.insertAtPos(1,20);
        list.display();
    }
}
