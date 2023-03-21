package Concrete;

import Abstract.IGamesService;
import Entities.Game;

public class GameManager implements IGamesService {

	@Override
	public void addGames(Game game) {
		System.out.println("Oyun eklendi: "+game.getId());
		
		
	}

	@Override
	public void deleteGames(Game game) {
		System.out.println("Oyun silindi: "+ game.getId());
		
	}

	@Override
	public void updateGames(Game game) {
		System.out.println("Oyun güncellendi: "+ game.getId());
		
	}

}
