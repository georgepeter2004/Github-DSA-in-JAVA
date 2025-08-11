class Node1{
    int data;
    Node1 next;

    Node1(int val){
        data = val;
        next = null;
    }
}
public class SingleLinkedList1 {
    Node1 head;
    SingleLinkedList1(){
        head = null;
    }
    public void insertAtBeginning(int val){
        Node1 newNode = new Node1(val);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void get(int pos){
        Node1 temp = head;
        for(int i = 1;i<=pos;i++){
            temp = temp.next;
        }
        System.out.println(temp.data+" ");
    }
    public void update(int pos,int val){
        Node1 temp = head;
        Node1 prev = null;
        Node1 newNode = new Node1(val);
        for(int i =1;i<=pos;i++){
            prev = temp;
            temp = temp.next;
        }
        newNode.next = temp.next;
        prev.next = newNode;



    }
    public void deleteAtEnd(){
        Node1 temp = head;
        Node1 prev = null;
        for(int i=1;temp!=null;i++) {
            temp = temp.next;
        }
        temp = null;
    }
    public void display() {
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

}
