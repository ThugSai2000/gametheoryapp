/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamestrategy.strategies;

/**
 *
 * @author saiki
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public abstract class StrategiesPlayer2 {


  protected List<Integer> opponentMoveHistory;
  protected List<Integer> outcomes;

  StrategiesPlayer2() {
    this.opponentMoveHistory = new ArrayList<>();
    this.outcomes = new ArrayList<>();
  }

  /**
     * Gives the move of the strategy at that turn; either
     
     *
     * @return strategy 
     */
  public abstract int makeMove();

  /**
   * For ease of keeping track of strategies
   *
   * @return name of strategy
   */
  public String getStrategyName() {
    return this.getClass().getSimpleName();
  }

  /**
   * Add the opponent's previous move to this strategy's
   * opponent history
   *
   * @param opponentMove the opponent's previous move (1 for cooperate, 0 for defect)
   */
  public void addOpponentMove(int opponentMove) {
    this.opponentMoveHistory.add(opponentMove);
  }

  /**
   * Get total points from outcomes
   *
   * @return sum of outcomes
   */
  public int getPoints() {
    return this.outcomes.stream().reduce(0, (a, b) -> a + b);
  }

  /**
   * Clears the outcomes and opponentMoveHistory arrays
   */
  public void clearStrategy() {
    this.outcomes.clear();
    this.opponentMoveHistory.clear();
  }

  /**
   * Add the outcome of the battle and add the opponent's
   * previous move to this strategy's opponent history
   *
   * @param outcome the outcome of the battle
   */
  public void addOutcome(int outcome) {
    this.outcomes.add(outcome);
  }

  /**
   * Returns an unmodifiable list of the outcomes of
   * this strategy's battles
   */
  public List<Integer> getOutcomes() {
    return Collections.unmodifiableList(outcomes);
  }
}

