/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamestrategy.strategies;

/**
 *
 * @author saiki
 */
public class ModifiedTicForTat extends StrategiesPlayer1 {
    /**
	 * This strategy (Tit-For-Tat) copies the previous move of the opposing player.
	 * This is generally known as a fairly good strategy, as it is simultaneously
	 * nice, forgiving, and revengeful.
	 *
	 * This requires adding opponent move history after each battle
	 */

	public ModifiedTicForTat() {
		super();
	}

	@Override
	public int makeMove() {
		if (opponentMoveHistory.isEmpty()) {
			return 1;
		}
		return opponentMoveHistory.get(opponentMoveHistory.size() - 1);
	}
}
