package com;

/**
 * @class- main class GamblingStimulator
 * @author - vamshi
 * about- this Program is about a Gambling Stimulation
 */

public class GamblingStimulation {
    public static void main(String[] args) {
        System.out.println("**Welcome to Gambling Stimulation**");
        GamblingStimulation gamblingStimulation = new GamblingStimulation();
        gamblingStimulation.gambler();
    }
    void gambler(){
        int stake = 100;
        int everyGameBet = 1;
        System.out.println("Gambler Starting with stake: $"+stake+" and this every game bet is: $"+everyGameBet);
    }
}
