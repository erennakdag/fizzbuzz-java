package com.company;

import java.util.Scanner;

public class Player {

    private final String name;
    private int gamesPlayed;
    private int gamesWon;
    private final Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.gamesPlayed = 0;
        this.gamesWon = 0;
    }

    public String getAnswer() {
        System.out.printf("%s: ", this.name);
        return this.scanner.nextLine();
    }

    public void showVictoryMessage() {
        System.out.printf("Congratulations %s%n", this.name);
        this.gamesWon++;
        showScore();
    }

    public void showTieMessage(Player opponent) {
        System.out.printf("Well played %s%n", opponent.name);
        showScore();
    }

    public void showDefeatMessage() {
        System.out.printf("Better luck next time %s%n", this.name);
        showScore();
    }

    public void showScore() {
        this.gamesPlayed++;
        System.out.printf("%s Win Percentage: %.2f%%%n", this.name, (this.gamesWon / (float) this.gamesPlayed) * 100);
    }

}
