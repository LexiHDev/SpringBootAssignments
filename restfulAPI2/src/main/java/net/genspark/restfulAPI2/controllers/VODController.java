package net.genspark.restfulAPI2.controllers;

import net.genspark.restfulAPI2.entities.VOD;
import net.genspark.restfulAPI2.services.VODService;
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
class VODController
{
	private @Autowired
	VODService VODService;
	
	@GetMapping("/")
	public String index() {
		return "<HTML><h1>Welcome to the index of my project.</h1></HTML>";
	}
	
	@GetMapping("/VOD")
	public List<VOD> getAllVOD() {
		return this.VODService.getAllVODS();
	}
	
	@GetMapping("/VOD/{id}")
	public VOD getVOD(@PathVariable long id) {
		return this.VODService.getVODById(id);
	}
	
	@GetMapping("/VOD/name/{name}")
	public VOD getVOD(@PathVariable String name) {
		return this.VODService.getVODByName(name);
	}
	
	@PostMapping("/VOD")
	public VOD addVOD(@RequestBody VOD VOD) {
		return this.VODService.addVOD(VOD);
	}
	
	@PutMapping("/VOD")
	public VOD updateVOD(@RequestBody VOD VOD) {
		return this.VODService.changeVOD(VOD);
	}
	
	@DeleteMapping("/VOD/{id}")
	public boolean deleteVOD(@PathVariable long id) {
		return this.VODService.deleteVOD(id);
	}
	
}
