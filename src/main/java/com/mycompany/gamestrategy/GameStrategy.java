/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamestrategy;

/**
 *
 * @author saiki
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//player 1 strategies
import com.mycompany.gamestrategy.strategies.StrategiesPlayer1;
import com.mycompany.gamestrategy.strategies.AlwaysX;
import com.mycompany.gamestrategy.strategies.AlwaysY;
import com.mycompany.gamestrategy.strategies.AlwaysZ;
//player 2 strategies
import com.mycompany.gamestrategy.strategies.StrategiesPlayer2;
import com.mycompany.gamestrategy.strategies.AlwaysG;
import com.mycompany.gamestrategy.strategies.AlwaysM;
import com.mycompany.gamestrategy.strategies.AlwaysW;

public class GameStrategy {
    
    
    /**
	 * GameStrategy Class
	 *
         * This is the game matrix for the six strategies each player has 3 each strategies other cannot copy
	 * Hold games with strategies s1 and s2, where the rewards for two players with different strategies are below.
	 * Different games with different weights should be explored!
	 *
	 * Rewards or payoff
	 * ----------| AlwaysX           | AlwaysY           | AlwaysZ
	 * ----------|-------------------| ----------------- | -----------------
	 * AlwaysG   | 3,3               | 1,5               | 4,2
	 * AlwaysM   | 5,1               | 2,2               | 0,4
         * AlwaysW   | 2,4               | 4,1               | 3,3
	 */
    
   private StrategiesPlayer1 s1;
   private StrategiesPlayer2 s2;
   
//  p means player outcome variable
//  so there are 5 different a player may get so i created variable according to it
   private static final int pA = 1;
   private static final int pB = 2;
   private static final int pC = 3;
   private static final int pD = 4;
   private static final int pE = 5;
   
    public GameStrategy(StrategiesPlayer1 strategy1, StrategiesPlayer2 strategy2) {
                    this.s1 = strategy1;
                    this.s2 = strategy2;
    }
    
    List<Integer> executeGame(int numIterations) {

		if (numIterations < 0) {
			throw new RuntimeException("number of iterations of a game must be greater than 0");
		}

		for (int i = 0; i < numIterations; i++) {
			battle(s1, s2);
		}

		int s1Points = s1.getPoints();
		int s2Points = s2.getPoints();

		s1.clearStrategy();
		s2.clearStrategy();

		return new ArrayList<>(
				Arrays.asList(s1Points, s2Points)
		);
	}

//    battle between player1 and player2
    private void battle(StrategiesPlayer1 s1, StrategiesPlayer2 s2) {

		// Make your moves
		int s1Move = s1.makeMove();
		int s2Move = s2.makeMove();

		// Give the opponents moves to each player
		s1.addOpponentMove(s2Move);
		s2.addOpponentMove(s1Move);
        System.out.println("S1: " + s1Move);
        System.out.println("S2: " + s2Move);
		// 
		if (s1Move==1 && s2Move ==4) {
                    
			s1.addOutcome(pC);
			s2.addOutcome(pC);
		}
		// 
		else if (s1Move==1 && s2Move ==5) {
			s1.addOutcome(pE);
			s2.addOutcome(pA);
		}
		// 
		else if (s1Move==1 && s2Move ==6) {
			s1.addOutcome(pB);
			s2.addOutcome(pD);
		}
                if (s1Move==2 && s2Move ==4) {
			s1.addOutcome(pA);
			s2.addOutcome(pD);
		}
		// 
		else if (s1Move==2 && s2Move ==5) {
			s1.addOutcome(pB);
			s2.addOutcome(pB);
		}
		// 
		else if (s1Move==2 && s2Move ==6) {
			s1.addOutcome(pD);
			s2.addOutcome(pA);
		}
                
                else if (s1Move==3 && s2Move ==4) {
			s1.addOutcome(pD);
			s2.addOutcome(pB);
		}
		// 
		else if (s1Move==3 && s2Move ==5) {
			s1.addOutcome(0);
			s2.addOutcome(pD);
		}

		else {
			s1.addOutcome(pC);
			s2.addOutcome(pC);
		}
	}
    
     public static void main(String[] args) {
    // Create two Strategy each strategy is played by their respective player objects (replace with your specific strategies)
      StrategiesPlayer1 strategy1 = new AlwaysY(); 
      StrategiesPlayer2 strategy2 = new AlwaysW();  // Example strategy, replace as needed

    // Create an App object with the strategies
    
    GameStrategy game = new GameStrategy(strategy1, strategy2);

    // Set the number of iterations for the game
    int numIterations = 1;

    // Execute the game and get the scores
    List<Integer> scores = game.executeGame(numIterations);
      
     
    // Print the Favoravle OutComes for each strategy
    
    System.out.println("Strategy 1 Favorable Outcome: " + (scores.get(0)));
    System.out.println("Strategy 2 Favorable Outcome: " + (scores.get(1)));

//      System.out.println("Strategy 1 Score: " + scores);

  }
   
}


