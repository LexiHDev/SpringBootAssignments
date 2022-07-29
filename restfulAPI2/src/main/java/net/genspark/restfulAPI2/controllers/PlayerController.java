package net.genspark.restfulAPI2.controllers;

import net.genspark.restfulAPI2.entities.Player;
import net.genspark.restfulAPI2.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public @RestController
class PlayerController
{
	private @Autowired
	PlayerService playerService;
	
	@GetMapping("/Players")
	public List<Player> getAllPlayers() {
		return this.playerService.getAllPlayers();
	}
	
	@GetMapping("/Players/{id}")
	public Player getPlayer(@PathVariable long id) {
		return this.playerService.getPlayerById(id);
	}
	
	@GetMapping("/Players/name/{name}")
	public Player getPlayerByName(@PathVariable String name) {
		return this.playerService.getPlayerByName(name);
	}
	
	@PostMapping("/Players")
	public Player addPlayer(@RequestBody Player player) {
		return this.playerService.addPlayer(player);
	}
	
	@PutMapping("/Players")
	public Player updatePlayer(@RequestBody Player player) {
		return this.playerService.changePlayer(player);
	}
	
	@DeleteMapping("/Players/{id}")
	public boolean deletePlayer(@PathVariable long id) {
		return this.playerService.deletePlayer(id);
	}
	
}
