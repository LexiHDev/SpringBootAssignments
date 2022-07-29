package net.genspark.restfulAPI2.services;

import net.genspark.restfulAPI2.dao.PlayerDAO;
import net.genspark.restfulAPI2.entities.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public @Service
class PlayerServiceImp implements PlayerService
{
	@Autowired
	PlayerDAO playerDAO;
	
	@Override
	public List<Player> getAllPlayers()
	{
		
		return playerDAO.findAll();
	}
	
	public Player getPlayerById(long id)
	{
		return playerDAO.findById(id).orElse(null);
	}
	
	@Override
	public Player getPlayerByName(String name)
	{
		return playerDAO.findById(playerDAO.getPlayerIdFromName(name)).orElse(null);
	}
	
	
	@Override
	public Player changePlayer(Player player)
	{
		playerDAO.saveAndFlush(player);
		return player;
	}
	
	@Override
	public Player addPlayer(Player player)
	{
		return playerDAO.save(player);
	}
	
	@Override
	public boolean deletePlayer(long id)
	{
		boolean exists = getPlayerById(id) != null;
		if (exists)
		{
			playerDAO.delete(getPlayerById(id));
		}
		return exists;
	}
}
