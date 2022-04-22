package com.company;

public class FizzBuzz {

    private final Player player1;
    private final Player player2;

    public FizzBuzz(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(int rounds) throws Exception {

        Player[] players = new Player[] {this.player1, this.player2};
        String[] answers = getAnswers(rounds);

        for (int i = 0; i < rounds; i++) {
            Player currPlayer = players[i % 2];
            String playerAnswer = currPlayer.getAnswer();
            if (!playerAnswer.equals(answers[i])) {
                currPlayer.showDefeatMessage();

                Player otherPlayer = players[i % 2 == 0 ? 1 : 0];
                otherPlayer.showVictoryMessage();

                return;
            }

        }

        // We have a tie
        players[0].showTieMessage(players[1]);
        players[1].showTieMessage(players[0]);

    }

    private String[] getAnswers(int rounds) throws Exception {
        if (rounds < 1) {
            throw new Exception("Rounds must be a positive integer!");
        }
        String[] result = new String[rounds];
        for (int i = 1; i <= rounds; i++) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                sb.append(i);
            }
            result[i - 1] = sb.toString();
        }
        return result;
    }
}
