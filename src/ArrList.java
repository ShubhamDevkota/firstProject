import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList<Integer>();
        ArrayList <Integer> myListeven = new ArrayList<Integer>();
        ArrayList <Integer> myListodd = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
//        myList.add(1);
//        myList.add(2);
//        myList.add(0,3);
//        myList.remove(2);
//        System.out.println("enter how many values do you want to add");
//        int n = scanner.nextInt();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("enter value no:"+ (i+1));
            int value = scanner.nextInt();
            myList.add(value);
        }

        for (int i = 0; i < 10; i++){
            if(myList.get(i)%2==0){
                myListeven.add(myList.get(i));
            }
            else{
                myListodd.add(myList.get(i));
            }
        }

        System.out.println("even numbers are: ");
        System.out.print(myListeven+" ");
        System.out.println();
        System.out.println("odd numbers are: ");
        System.out.print(myListodd+" ");
        System.out.println();

        int nE = myListeven.size();
        int nO = myListodd.size();
        if (nE == nO) {
            System.out.println("even and odd numbers are equal");
        }
        else if(nE > nO){
            System.out.println("There are more even numbers");
        }
        else{
            System.out.println("There are more odd numbers");
        }

        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < myListeven.size(); i++) {
            sumEven = sumEven + myListeven.get(i);
            System.out.println("Sum of even numbers is:"+sumEven);
        }
        for (int i = 0; i < myListodd.size(); i++) {
            sumOdd = sumOdd + myListodd.get(i);
            System.out.println("Sum of odd numbers is:"+sumOdd);
        }

        if(sumEven == sumOdd){
            System.out.println("Sum of even numbers an odd numbers are equal");
        }
        else if (sumEven > sumOdd) {
            System.out.println("Sum of even numbers is more than odd numbers");

        }
        else{
            System.out.println("Sum of odd numbers is more than even numbers");
        }

//        System.out.println(myList);
//        System.out.println(myList.get(0));

//        for(Integer i : myList) {
//            System.out.print(i+" ");
//        }

    }
}
