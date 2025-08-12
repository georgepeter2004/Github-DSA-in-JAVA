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
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion on empty List");
        }
        Node1 temp = head;
        Node1 prev = null;
        while(temp.next !=null){
            prev = temp;
            temp = temp.next;
        }
         prev.next = null ;
    }
    public void display() {
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public void insertAtEnd(int val){
        if(head==null){
            throw new IndexOutOfBoundsException("Inserting element in empty list");
        }
        Node1 newNode = new Node1(val);
        Node1 temp = head;
        Node1 prev = head;
        while(temp != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = newNode;

    }
    public void search(int val){
        if(head==null){
            throw new IndexOutOfBoundsException("Searching element in empty list");
        }
        Node1 newNode = new Node1(val);
        Node1 temp = head;
        for(int i=0;temp!=null;i++){
            if(temp.data==newNode.data){
                System.out.print(i+" ");
                return ;
            }
            temp=temp.next;
        }
    }

    public void contains(int val){
        if(head==null){
            throw new IndexOutOfBoundsException("Searching element in empty list");
        }
        Node1 newNode = new Node1(val);
        Node1 temp = head;
        for(int i=0;temp!=null;i++){
            if(temp.data==newNode.data){
                System.out.println(true);
                return;
            }
            temp=temp.next;
        }
        System.out.println(false);
    }

}
