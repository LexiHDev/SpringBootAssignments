package net.genspark.restfulAPI2.services;

import net.genspark.restfulAPI2.entities.VOD;

import java.util.List;

public interface VODService
{
	List<VOD> getAllVODS();
	VOD getVODById(long id);
	VOD getVODByName(String name);
	VOD addVOD(VOD VOD);
	boolean deleteVOD(long id);
	VOD changeVOD(VOD VOD);
}
