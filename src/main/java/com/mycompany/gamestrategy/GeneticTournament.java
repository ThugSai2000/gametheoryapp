/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamestrategy;

/**
 *
 * @author saiki
 */
import com.mycompany.gamestrategy.strategies.ModifiedGeneticStrategy;

import com.mycompany.gamestrategy.strategies.StrategiesPlayer1;
import com.mycompany.gamestrategy.strategies.AlwaysX;
import com.mycompany.gamestrategy.strategies.AlwaysY;
import com.mycompany.gamestrategy.strategies.AlwaysZ;
//player 2 strategies
import com.mycompany.gamestrategy.strategies.StrategiesPlayer2;
import com.mycompany.gamestrategy.strategies.AlwaysG;
import com.mycompany.gamestrategy.strategies.AlwaysM;
import com.mycompany.gamestrategy.strategies.AlwaysW;

import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class GeneticTournament {

//  private HashMap<StrategiesPlayer1, Integer> player1Points;
//  private HashMap<StrategiesPlayer2, Integer> player2Points;
//  private int[][] player1PayoffMatrix;
//  private int[][] player2PayoffMatrix;
//
//  public GeneticTournament(List<StrategiesPlayer1> player1Strategies, List<StrategiesPlayer2> player2Strategies,
//                           int[][] player1Payoff, int[][] player2Payoff) {
//    this.player1Points = new HashMap<>();
//    this.player2Points = new HashMap<>();
//    player1Strategies.forEach(s -> this.player1Points.put(s, 0));
//    player2Strategies.forEach(s -> this.player2Points.put(s, 0));
//    this.player1PayoffMatrix = player1Payoff;
//    this.player2PayoffMatrix = player2Payoff;
//  }
//
//  public HashMap<StrategiesPlayer1, Integer> executeGeneticTournamentRounds(int numRounds) throws IOException {
//    HashMap<StrategiesPlayer1, Integer> player1FinalScores = new HashMap<>();
//    HashMap<StrategiesPlayer2, Integer> player2FinalScores = new HashMap<>();
//
//    FileWriter fileWriter = new FileWriter("geneticRes.txt");
//    PrintWriter printWriter = new PrintWriter(fileWriter);
//
//    for (int i = 0; i < numRounds; i++) {
//      System.out.println(i);
//
//      // Battle!
//      addNewPoints(tournamentRound());
//
//      // Sort entries
//      ArrayList<Map.Entry<StrategiesPlayer1, Integer>> player1Sorted = sortEntries(player1Points.entrySet());
//      ArrayList<Map.Entry<StrategiesPlayer2, Integer>> player2Sorted = sortEntries(player2Points.entrySet());
//
//      // Logging and Selection (replace with your selection logic)
//      if (i == 0) {
//        // Log initial scores
//        printWriter.println("Player 1 Strategies:");
//        player1Points.forEach((s, v) -> printWriter.printf("%s %d\n", s.getName(), v));
//        printWriter.println("Player 2 Strategies:");
//        player2Points.forEach((s, v) -> printWriter.printf("%s %d\n", s.getName(), v));
//        printWriter.println("-------");
//      }
//
//      // Remove bottom performers (replace with your selection logic)
//      // Here, we're keeping all strategies for demonstration
//
//      // Logging and Mutation (replace with your mutation logic)
//      printWriter.println("Player 1 Strategies:");
////      player1Points.forEach((s, v) -> {
////        s.mutate();
////        printWriter.printf("%s %d\n", s.getName(), v);
////      });
////      printWriter.println("Player 2 Strategies:");
////      player2Points.forEach((s, v) -> {
////        s.mutate();
////        printWriter.printf("%s %d\n", s.getName(), v);
////      });
//
//      // Reset points for next round
//      player1Points.replaceAll((s, v) -> 0);
//      player2Points.replaceAll((s, v) -> 0);
//
//      printWriter.println("-------");
//    }
//
//    player1FinalScores.putAll(player1Points);
//    player2FinalScores.putAll(player2Points);
//
//    printWriter.close();
//
//    return player1FinalScores;
//  }
//
//  private HashMap<StrategiesPlayer1, Integer> tournamentRound() {
//    HashMap<StrategiesPlayer1, Integer> player1TournamentPoints = new HashMap<>();
//    HashMap<StrategiesPlayer2, Integer> player2TournamentPoints = new HashMap<>();
//
//    for (StrategiesPlayer1 s1 : player1Points.keySet()) {
//      for (StrategiesPlayer2 s2 : player2Points.keySet()) {
//        int player1Score = player1PayoffMatrix[s1.getIndex()][s2.getIndex()];
//        int player2Score = player2PayoffMatrix[s2.getIndex()][s1.getIndex()]; // Opponent's perspective
//
//        player1TournamentPoints.put(s1, player1TournamentPoints.getOrDefault(s1, 0) + player1Score);
//        player2TournamentPoints.put(s2, player2TournamentPoints.getOrDefault(s2, 0) + player2Score);
//      }
//    }
//
//    // Combine points for final HashMap
//    HashMap<StrategiesPlayer1, Integer> combinedPoints = new HashMap<>();
//    combinedPoints.putAll(player1TournamentPoints);
     
}
