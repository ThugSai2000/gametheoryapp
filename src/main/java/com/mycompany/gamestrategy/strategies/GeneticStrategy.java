/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamestrategy.strategies;

/**
 *
 * @author saiki
 */

import java.util.Random;

public abstract class GeneticStrategy extends StrategiesPlayer1 {

    /**
     * This class is a genetic algorithm that acts on no knowledge of previous moves.
     */

    protected double weight;
    protected Random generator;
    protected int playerNumber; // Player this strategy belongs to (1 or 2)

    public GeneticStrategy(double n, int playerNumber) {
        weight = n;
        generator = new Random();
        this.playerNumber = playerNumber;
    }

    /**
     * Mutate this genetic strategy by modifying it's weight
     */
    public void mutate() {
        boolean pm = generator.nextDouble() > 0.5;
        double val = generator.nextDouble() * 0.004;
        weight = pm && weight + val < 1 ? weight + val : weight - val > 0 ? weight - val : weight;
    }

    /**
     * Mutate this genetic strategy and return a new instance
     */
    public abstract GeneticStrategy mutateNew();

    /**
     * Return the weight of the GeneticStrategy
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Abstract method that defines the logic of the strategy for each player
     * 
     * @return unique integer value based on player and strategy
     */
    public abstract int play();
}

