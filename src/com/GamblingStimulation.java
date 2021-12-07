package com;

import java.util.Random;

/**
 * @class- main class GamblingStimulator
 * @author - vamshi
 * about- this Program is about a Gambling Stimulation
 */


public class GamblingStimulation {
    int stake = 100;
    int winOrLoss() {
        final int everyDayBet = 1;
        Random r1 = new Random();
        int die = r1.nextInt(2);
        if (die ==1){
            stake = stake+everyDayBet;
        }else {
            stake = stake-everyDayBet;
        }
        return(stake);
    }
    public static void main(String[] args) {
        System.out.println("**Welcome to Gambling Stimulation**");
        GamblingStimulation gamblingStimulation = new GamblingStimulation();
        System.out.println(gamblingStimulation.winOrLoss());
    }
}
