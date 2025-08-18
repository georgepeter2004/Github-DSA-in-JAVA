public class CircularLLDemo {
    public static void main(String[] args) {
        CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();

        list.insertAtEnd(6);

        list.Display();
        list.deleteAtEnd();
        System.out.println();
        list.Display();


    }
}
