



public class SingleLinkedList
{
    Node head;
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

        SingleLinkedList() {
            head = null;
        }

        public void insertAtBeginning(int val) {
            Node Newnode = new Node(val);
            if (head == null) {//empty list
                head = Newnode;
            } else //some values inside
            {
                Newnode.next = head;
                head = Newnode;
            }
        }

        public void insertAtPos(int pos,int val){
        Node Newnode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
        }
            Newnode.next = temp.next;
            temp.next = Newnode;

        }

        public void display() {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }


}
