package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First players name: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Second players name: ");
        Player player2 = new Player(scanner.nextLine());

        FizzBuzz fizzbuzz = new FizzBuzz(player1, player2);

        System.out.print("Wanna play FizzBuzz? [y/n] ");
        boolean isPlaying = scanner.nextLine().equals("y");
        while (isPlaying) {
            System.out.print("How many rounds? ");
            try {
                fizzbuzz.play(Integer.parseInt(scanner.nextLine()));
                System.out.print("Wanna play again? [y/n] ");
                isPlaying = scanner.nextLine().equals("y");
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
