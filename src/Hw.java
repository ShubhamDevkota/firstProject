import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


      //  Hot Cold Game

        int number = 76;
        int diff1, diff2;
        int guess2 = 0;

        System.out.println("Guess a number ");
        int guess1 = scanner.nextInt();
        if (guess1 == number) {
            System.out.println("You guessed correctly!");
        } else if (guess1 > number) {
            System.out.println("guess another number");
            while (guess2 != number) {
                guess2 = scanner.nextInt();
                diff1 = Math.abs(guess1 - number);
                diff2 = Math.abs(guess2 - number);
                if (guess2 == number) {
                    System.out.println("You guessed correctly!");
                } else if (diff1 < diff2) {
                    System.out.println("cold");
                } else if (diff1 > diff2) {
                    System.out.println("hot");
                } else {
                }
            }
        } else if (guess1 < 100) {
            System.out.println("guess another number");
            while (guess2 != number) {
                guess2 = scanner.nextInt();
                diff1 = Math.abs(number - guess1);
                diff2 = Math.abs(guess2 - number);
                if (guess2 == number) {
                    System.out.println("You guessed correctly!");
                } else if (diff1 < diff2) {
                    System.out.println("cold");
                } else if (diff1 > diff2) {
                    System.out.println("hot");
                } else {
                }
            }

        }


        // Car Game

//        System.out.println("Your car is in rest");
//        System.out.println("Type Hint if you want hint");
//        String hint = scanner.nextLine();
//        switch (hint) {
//            case "hint":
//                System.out.println("Press Y to play the game");
//                System.out.println("Press N to deny");
//                System.out.println("Press W to move forward");
//                System.out.println("D for turn right");
//                System.out.println("A to turn left");
//                System.out.println("S to reverse");
//                System.out.println("Press F to stop the game");
//        }
//        boolean movement = true;
//        System.out.println("Enter Y or N to continue");
//        String y_or_n = scanner.nextLine();
//        switch (y_or_n) {
//            case "y":
//                System.out.println("Car is started");
//                while (movement == true) {
//                    String move = scanner.nextLine();
//                    switch (move) {
//                        case "w":
//                            System.out.println("Your car is moving forward");
//                            break;
//                        case "d":
//                            System.out.println("Your car is moving right");
//                            break;
//                        case "a":
//                            System.out.println("Your car is turning left");
//                            break;
//                        case "s":
//                            System.out.println("Your car is turning backward");
//                            break;
//                        case "f":
//                            movement = false;
//                            break;
//                        default:
//                            System.out.println("Enter valid key");
//                            break;
//
//                    }
//                }
//            case "n":
//                System.out.println("game closed");
//                break;
//        }





    }
}



