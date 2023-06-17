package RockPaperAndScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("the winner is wins the game 3 times");
        Random random = new Random();
        String[] rps = {"Rock","Paper","Scissors"};
        Scanner scanner = new Scanner(System.in);
        int pcSkor =0;
        int oyuncuSkor =0;
        do {
            String input = scanner.next();
            int a = random.nextInt(3);
            if (a == 0 && input.equalsIgnoreCase("rock")) {
                System.out.println("Computer:" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)""");
                System.out.println("Draw! " + "Computer Score is : " + pcSkor + " Player score is : " + oyuncuSkor);
            } else if (a == 0 && input.equalsIgnoreCase("paper")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)""");
                oyuncuSkor++;
                System.out.println("Player wins the round! " + "Computer score is : " + pcSkor + " Player score is : " + oyuncuSkor);
            } else if (a == 0 && input.equalsIgnoreCase("scissors")) {
                System.out.println("The Computer's choice :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)
                              (_____)
                              (_____)
                              (____)
                        ---.__(___)""");
                pcSkor++;
                System.out.println("Computer wins the round! " + "Computer score is : " + pcSkor + " Player score is : " + oyuncuSkor);
            }
            if (a == 1 && input.equalsIgnoreCase("rock")) {
                System.out.println("Bilgisayarın tuttuğu :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                                  _______)
                                 _______)
                        ---.__________)""");
                pcSkor++;
                System.out.println("Bilgisayar kazandı! " + "Bilgisayar skoru : " + pcSkor + " Oyuncu skoru : " + oyuncuSkor);
            } else if (a == 1 && input.equalsIgnoreCase("paper")) {
                System.out.println("Bilgisayarın tuttuğu :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                                  _______)
                                 _______)
                        ---.__________)""");
                System.out.println("Berabere! " + "Bilgisayar skoru :" + pcSkor + " Oyuncu skoru : " + oyuncuSkor);
            } else if (a == 1 && input.equalsIgnoreCase("scissors")) {
                System.out.println("Bilgisayarın tuttuğu :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                                  _______)
                                 _______)
                        ---.__________)""");
                oyuncuSkor++;
                System.out.println("Oyuncu kazandı! " + "Bilgisayar skoru : " + pcSkor + " Oyuncu skoru : " + oyuncuSkor);
            }
            if (a == 2 && input.equalsIgnoreCase("rock")) {
                System.out.println("Bilgisayarın tuttuğu :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)""");
                oyuncuSkor++;
                System.out.println("Oyuncu kazandı! " + "Bilgisayar skoru : " + pcSkor + " Oyuncu skoru : " + oyuncuSkor);
            } else if (a == 2 && input.equalsIgnoreCase("paper")) {
                System.out.println("Bilgisayarın tuttuğu :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)""");
                pcSkor++;
                System.out.println("Bilgisayar kazandı! " + "Bilgisayar skoru : " + pcSkor + " Oyuncu skoru : " + oyuncuSkor);
            } else if (a == 2 && input.equalsIgnoreCase("scissors")) {
                System.out.println("Bilgisayarın tuttuğu :" + rps[a]);
                System.out.println("""
                            _______
                        ---'   ____)____
                                  ______)
                               __________)
                              (____)
                        ---.__(___)""");
                System.out.println("Draw! " + "Bilgisayar skoru : " + pcSkor + " Oyuncu skoru : " + oyuncuSkor);
            }
            if (pcSkor == 3) {
                System.out.println("Kaybettiniz :)");
            } else if (oyuncuSkor == 3) {
                System.out.println("Tebrikler kazandınız :)");
            }
        } while (pcSkor != 3 && oyuncuSkor != 3);
    }
}