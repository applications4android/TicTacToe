package com.blogspot.applications4android.tictactoe.core;

import com.blogspot.applications4android.tictactoe.enums.PlayerEnum;
import com.blogspot.applications4android.tictactoe.exceptions.PlayerException;


/** Controller class for all types of tic-tac-toe board games */
public class BoardController {
    /** player who is supposed to make the current move */
    private PlayerEnum currentPlayer;
    /** players playing this game */
    private Players players;

    /**
     * Constructor
     * @param firstPlayer first player to make the move in this game
     * @param p all players playing this game
     */
    public BoardController(PlayerEnum firstPlayer, Players p) {
        currentPlayer = firstPlayer;
        players = p;
    }

    /**
     * Get the current player who is supposed to make the move
     * @return current player
     * @throws PlayerException 
     */
    public Player getCurrentPlayer() throws PlayerException {
        return players.getPlayer(currentPlayer);
    }

    /** Evaluate the next player who is supposed to make the move */
    public void evaluateNextPlayer() {
        currentPlayer = currentPlayer.nextPlayer();
    }
}
