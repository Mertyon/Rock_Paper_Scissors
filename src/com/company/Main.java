package com.company;
import java.util.Random;
import java.util.Scanner;



public class Main {

        public static final String ROCK = "R";
        public static final String PAPER = "P";
        public static final String SCISSORS = "S";


        //Get Result
        public static void getResult(String usersMove, String computersMove) {
            System.out.println("Computer's move is: " + computersMove);

            if (usersMove.equals(computersMove))
                System.out.println("It's a tie!");

            //User == Rock
            else if (usersMove.equals(ROCK))
            {
                if (computersMove.equals(SCISSORS))
                    System.out.println("Rock crushes scissors. You win!!");
                else if (computersMove.equals(PAPER))
                    System.out.println("Paper eats rock. You lose!!");
            }

            //User == Paper
            else if (usersMove.equals(PAPER))
            {
                if (computersMove.equals(ROCK))
                    System.out.println("Paper eats rock. You win!!");
                else if (computersMove.equals(SCISSORS))
                    System.out.println("Scissor cuts paper.  You lose!!");
            }

            //User == Scissors
            else if (usersMove.equals(SCISSORS))
            {
                if (computersMove.equals(PAPER))
                    System.out.println("Scissor cuts paper.  You win!!");
                else if (computersMove.equals(ROCK))
                    System.out.println("Rock breaks scissors.  You lose!!");
            }
            else
                System.out.println("Invalid user input.");
        }


        //Get Computer's move
        public static String getComputersMove(){
            int computersNum;
            String computersMove="";
            Random random = new Random();
            computersNum = random.nextInt(3) + 1;
            if (computersNum == 1)
                computersMove = ROCK;
            else if (computersNum == 2)
                computersMove = PAPER;
            else if (computersNum == 3)
                computersMove = SCISSORS;
            return computersMove;
        }


        //Get User's move | Auto changing into Uppercase
        public static String getUsersMove(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your play: ");
            String input = scanner.next().toUpperCase();
            return input;
        }


        //Main method

        public static void main(String[] args) {
            System.out.println( "Rock, Paper, Scissors!\n"
                    + "Please enter a move.\n"
                    +"Rock = R, Paper= P, and Scissors = S.\n");
            String userInput = getUsersMove();
            if (userInput.equals(PAPER) || userInput.equals(ROCK) || userInput.equals(SCISSORS))
                getResult(userInput, getComputersMove());
            else
                System.out.println("Invalid Input " + userInput);
        }
}

