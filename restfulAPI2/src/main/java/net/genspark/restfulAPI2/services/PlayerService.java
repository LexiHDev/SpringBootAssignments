package net.genspark.restfulAPI2.services;

import net.genspark.restfulAPI2.entities.Player;

import java.util.List;

public interface PlayerService
{
	List<Player> getAllPlayers();
	Player getPlayerById(long id);
	Player getPlayerByName(String name);
	Player changePlayer(Player player);
	Player addPlayer(Player player);
	boolean deletePlayer(long name);
}
