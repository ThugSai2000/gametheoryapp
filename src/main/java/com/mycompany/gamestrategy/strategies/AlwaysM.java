/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamestrategy.strategies;

/**
 *
 * @author saiki
 */
public class AlwaysM extends StrategiesPlayer2 {

	public AlwaysM() {
		super();
	}

	/**
	 * Always cooperate; therefore, always return true
	 *
	 * @return true
	 */
	@Override
	public int makeMove() {
		return 5;
	}

}