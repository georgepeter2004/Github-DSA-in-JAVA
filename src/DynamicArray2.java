import java.util.*;
class dynamicFunction2{

}
public class DynamicArray2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice,pos;
        while(true){
            System.out.println("1.Delete at End");
            System.out.println("2.Delete from Beginning");
            System.out.println("3.Insert at beginning");
            System.out.println("4.Get(index)");
            System.out.println("5.Update(index)");
            System.out.println("6.Search(value)");
            System.out.println("7.Clear");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    //deleteAtEnd();
                    break;
                case 2 :
                    //deleteAtBeg();
                    break;
                case 3:
                    //insertAtBeg();
                    break;
                case 4:
                   // if(pos<0){
                        System.out.println("Invalid Position");
                    //}
                    //get();
            }
        }
    }
}
