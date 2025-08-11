import org.w3c.dom.Node;

public class DoublyLinkedList {
    int val;
    Node head;
    Node tail;

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }
    DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtPos(int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            tail  = newNode;
        }else{
            newNode.prev = head;
            newNode.next = head;
            head = newNode;
        }
    }
}
