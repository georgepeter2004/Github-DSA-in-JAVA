import java.util.*;
class DynamicArrayfunction{
    static final int initvalue=8;
    private int arr[];
    private int size,capacity;

DynamicArrayfunction(){
    size = 0;
    arr = new int[initvalue];
    capacity = initvalue;
}

public void add(int val) {
    arr[size++] = val;
    if (size == capacity) {
        expandArray();
    }
}
    private void expandArray(){
        capacity *= 2;
       arr = java.util.Arrays.copyOf(arr,capacity);

}

public void Display(){
    System.out.println("ELements :");
    for(int i = 0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

public void insertAtPos(int pos,int val){
    if(size == capacity) expandArray();

    for(int i=size-1;i>=pos;i--){
        arr[i+1]=arr[i];
        size++;
    }
    arr[pos]=val;
}

public void deleteAtPos(int pos){
    for(int i = pos+1;i<size;i++){
        arr[i-1]=arr[i];
        size--;
        if(capacity > initvalue && capacity > 3*size) shrinkcapacity();
    }
}

private void shrinkcapacity(){
    capacity /=2;
    arr = java.util.Arrays.copyOf(arr,capacity);
}
public int length(){
    return size;
}
}
public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DynamicArrayfunction list = new DynamicArrayfunction();
        int pos,val,choice,length;
        while (true){
            System.out.println("1.Insert at End");
            System.out.println("2.Display");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            System.out.print("Enter the Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("Enter the Value: ");
                    val = sc.nextInt();
                    list.add(val);
                    break;
                case 2 :
                    list.Display();
                    break;

                case 3 :
                    length = list.length();
                    System.out.println("No of ELements in List:"+length);
                    System.out.print("Enter the position(Starts from 0): ");
                    pos = sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid Position");
                    }
                    System.out.println("Enter the Value:");
                    val = sc.nextInt();
                    list.insertAtPos(pos,val);
                    break;

                case 4 :
                    System.out.print("Enter the position(Starts from 0): ");
                    pos = sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid Position");
                    }
                    list.deleteAtPos(pos);
                    break;

                case 5 :
                    System.exit(0);

                default :
                    System.out.println("Invalid Choice");
            }
        }
    }
}
