/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamestrategy.strategies;

/**
 *
 * @author saiki
 */
public class ModifiedGeneticOneMove extends StrategiesPlayer1 {

  public ModifiedGeneticOneMove(int strategy) {
    super();
  }

  @Override
  public int makeMove() {
    int randomMove = (int) (Math.random() * 3) + 4; // Generate random move (4-6)
    return randomMove;
  }
}