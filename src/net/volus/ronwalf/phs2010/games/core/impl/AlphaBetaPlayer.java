package net.volus.ronwalf.phs2010.games.core.impl;

import net.volus.ronwalf.phs2010.games.core.GamePlayer;
import net.volus.ronwalf.phs2010.games.core.GameTransition;
import net.volus.ronwalf.phs2010.games.core.HeuristicFunction;
import net.volus.ronwalf.phs2010.games.core.PlayerState;
import net.volus.ronwalf.phs2010.games.core.SearchController;

public class AlphaBetaPlayer<State extends PlayerState, Action>
 	implements GamePlayer<State, Action> {

	GameTransition<State, Action> transition;
	HeuristicFunction<State> function;
	SearchController controller;
	
	public AlphaBetaPlayer(GameTransition<State, Action> transition,
			HeuristicFunction<State> function, SearchController controller) {
		this.transition = transition;
		this.function = function;
		this.controller = controller;
	}

	public Action move(State s) {
		controller.start();
		// your code here
		controller.stop();
		return null;
	}

}
