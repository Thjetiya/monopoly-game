package models;

public class MGame {
    private int roundCount;
    private Die[] dice;
    private Board board;
    private Player[] players;

    public void playGame(int N){
        while(roundCount< N){
            playRound();
        }
    }

    private void playRound(){
        for(Player player : players){
            player.takeTurn();
        }
    }
}
