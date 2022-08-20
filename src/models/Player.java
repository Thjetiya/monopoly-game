package models;

public class Player {

    private String name;

    public Die[] dice;

    public void takeTurn(){
        int[] fv = new int[dice.length];
        int fvTot = 0;

        for (int i = 0; i < dice.length; i++){
            dice[i].roll();
            fv[i] = dice[i].getFaceValue();
            fvTot += fv[i];
        }

    }
}
