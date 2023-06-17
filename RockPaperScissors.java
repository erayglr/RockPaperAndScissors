package RockPaperAndScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("**The winner is wins the game 3 times**\n");
        Random random = new Random();
        String[] rps = {"Rock","Paper","Scissors"};
        System.out.println("What is your choice ?");
        Scanner scanner = new Scanner(System.in);
        int pcScore =0;
        int playerScore =0;
        do {
            String input = scanner.next();
            int a = random.nextInt(3);
            if (a == 0 && input.equalsIgnoreCase("rock")) {
                System.out.println("The Computer's choice:" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)""");
                System.out.println("Draw! " + "Computer Score is : " + pcScore + " Player score is : " + playerScore);
            } else if (a == 0 && input.equalsIgnoreCase("paper")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)""");
                playerScore++;
                System.out.println("Player wins the round! " + "Computer score is : " + pcScore + " Player score is : " + playerScore);
            } else if (a == 0 && input.equalsIgnoreCase("scissors")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)""");
                pcScore++;
                System.out.println("Computer wins the round! " + "Computer score is : " + pcScore + " Player score is : " + playerScore);
            }
            if (a == 1 && input.equalsIgnoreCase("rock")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                                  _______)
                                 _______)
                        ---.__________)""");
                pcScore++;
                System.out.println("Computer wins the round! " + "Computer score is : " + pcScore + " Player score is : " + playerScore);
            } else if (a == 1 && input.equalsIgnoreCase("paper")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                                  _______)
                                 _______)
                        ---.__________)""");
                System.out.println("Draw! " + "Computer score is :" + pcScore + " Player score is : " + playerScore);
            } else if (a == 1 && input.equalsIgnoreCase("scissors")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                                  _______)
                                 _______)
                        ---.__________)""");
                playerScore++;
                System.out.println("Player wins the round! " + "Computer score is : " + pcScore + " Player score is : " + playerScore);
            }
            if (a == 2 && input.equalsIgnoreCase("rock")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)""");
                playerScore++;
                System.out.println("Player wins the round! " + "Computer score is : " + pcScore + " Player score is : " + playerScore);
            } else if (a == 2 && input.equalsIgnoreCase("paper")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)""");
                pcScore++;
                System.out.println("Bilgisayar kazandı! " + "Computer score is : " + pcScore + " Player score is : " + playerScore);
            } else if (a == 2 && input.equalsIgnoreCase("scissors")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)""");
                System.out.println("Draw! " + "Bilgisayar skoru : " + pcScore + " Player score is : " + playerScore);
            }
            if (pcScore == 3) {
                System.out.println("You lost  the game :)");
            } else if (playerScore == 3) {
                System.out.println("Congratulations, you have won :)");
            }
        } while (pcScore != 3 && playerScore != 3);
    }
}