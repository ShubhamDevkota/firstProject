import java.util.Scanner;

public class Main2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = scanner.nextInt();
//        if(n%2==0){
//            System.out.println("even");
//        }
//        else {
//             System.out.println("odd");
//        }

//        System.out.println("Enter your age");
//        int age = scanner.nextInt();
//        if(age<18){
//            System.out.println("You are not allowed to vote");
//        }
//        else {
//            System.out.println("You are allowed to vote");
//        }

//        int num = 90;
//        if(num%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
//
//        int age = 77;
//        if(age>18){
//            System.out.println("allowed to vote");
//        }
//        else{
//            System.out.println("not allowed to vote");
//        }


//        int num = 1;
//        if(num%3==0 && num%5==0){
//            System.out.println("fizzbuzz");
//        }
//        else if (num%3==0) {
//            System.out.println("fizz");
//        }
//        else if (num%5==0) {
//            System.out.println("buzz");
//        }
//        else{
//            System.out.println(num);
//        }


//        for(int num = 1; num <= 50; num++){
//            if(num%3==0 && num%5==0){
//                System.out.println("fizzbuzz");
//            }
//            else if (num%3==0) {
//                System.out.println("fizz");
//            }
//            else if (num%5==0) {
//                System.out.println("buzz");
//            }
//            else{
//                System.out.println(num);
//            }





//        System.out.println("Enter your return amount");
//        int note = scanner.nextInt();

//        if (note >=1000){
//            int times = note / 1000;
//            System.out.println("1000 *"+times);
//            note = note-(1000*times);
//        }
//
//
//        if (note >= 500) {
//            int times = note / 500;
//            System.out.println("500 *"+times);
//            note = note-(500*times);
//
//        }
//        if (note >= 100) {
//            int times = note / 100;
//            System.out.println("100 *"+times);
//            note = note-(100*times);
//
//        }
//        if (note >= 50) {
//            int times = note / 50;
//            System.out.println("50 *"+times);
//            note = note-(50*times);
//
//        }
//        if (note >= 20) {
//            int times = note / 20;
//            System.out.println("20 *"+times);
//            note = note-(20*times);
//
//        }
//        if (note >= 10) {
//            int times = note / 10;
//            System.out.println("10 *"+times);
//            note = note-(10*times);
//
//        }
//        if (note >= 5) {
//            int times = note / 5;
//            System.out.println("5 *"+times);
//            note = note-(5*times);
//
//        }



        for(int i=1; i <101;i++){
            System.out.println(i);
        }


        for (int i=0; i <101;i=i+2){
            System.out.println(i);
        }


        for(int i=1; i <101;i=i+2){
            System.out.println(i);

        }

        System.out.println("how many times do you want to print ram");
        int num = scanner.nextInt();
        for(int i =0;i<num;i++){
            System.out.println("Ram");
        }



        
    }
}
