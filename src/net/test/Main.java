package net.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question1 = "What's 1 + 1 ?";
        String question2 = "What's Best Joke ever?";
        String question3 = "Which year a calender starts itself?";


        int answer1 = 2;
        String answer2 = "My Life";
        String answer3 = "0";

        int point = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.println(question1);
        int userInput1 = Integer.parseInt(scanner.nextLine());

        if (userInput1 == answer1) {
            point++;
            System.out.println("Correct! You have " + point + " points." );
        } else {
            System.out.println("Incorrect! The correct answer is '" + answer1 + "'.");
        }


        System.out.println("");
        System.out.println(question2);
        String userInput2 = scanner.nextLine();


        if (userInput2.equals(answer2)) {
            point++;
            System.out.println("Correct! You have " + point + " points." );
        } else {
            System.out.println("Incorrect! The correct answer is YOUR LIFE.");
        }


        System.out.println("");
        System.out.println(question3);
        String userInput3 = scanner.nextLine();


        if (userInput3.equals(answer3)) {
            point++;
            System.out.println("Correct! You have " + point + " points." );
        } else {
            System.out.println("Incorrect! The correct answer is '" + answer3 + "'.");
        }

        System.out.println("");
        System.out.println("-----------------");
        System.out.println("");
        System.out.println("Your Total score: " + point);
        if (userInput2.equals(answer2)) {
            System.out.println("Also, glad to see you admit Your Life is best joke ever. xD");
        }

    }
}