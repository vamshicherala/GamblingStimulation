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
        int die = 0;
        int afterBet=0;
        Random r1 = new Random();
        for (int i=1;i<=20;i++) {
            stake= afterBet+100;
            int stakeCheck = stake;
            System.out.println("bet amount for day "+i+" is: $"+stake);
            int percent = stake/2;
            int profit = percent+stake;
            int loss = percent-stake;
            while (stake > loss && stake < profit) {
                die = r1.nextInt(2);
                if (die == 1) {
                    afterBet = stake + everyDayBet;
                } else {
                    afterBet = stake - everyDayBet;
                }
                stake = afterBet;
            }
            if (stakeCheck<afterBet){
                int prof= afterBet-stakeCheck;
                System.out.println("day "+i+" profit: $"+prof);
            }else {
                int los = stakeCheck-afterBet;
                System.out.println("day "+i+" loss: $"+los);
            }
        }
        System.out.println("Profit or loss is: $"+stake);
        return(stake);
    }
    public static void main(String[] args) {
        System.out.println("**Welcome to Gambling Stimulation**");
        GamblingStimulation gamblingStimulation = new GamblingStimulation();
        System.out.println("The Gambler starts the day with: $"+gamblingStimulation.stake);
        System.out.println("The mim amout to bet is: $1");
        gamblingStimulation.winOrLoss();
    }
}
