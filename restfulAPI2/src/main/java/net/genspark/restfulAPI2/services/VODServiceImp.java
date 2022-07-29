package net.genspark.restfulAPI2.services;

import net.genspark.restfulAPI2.dao.VODDAO;
import net.genspark.restfulAPI2.entities.VOD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public @Service
class VODServiceImp implements VODService
{
	@Autowired
	VODDAO VODDAO;
	
	@Override
	public List<VOD> getAllVODS()
	{
		
		return VODDAO.findAll();
	}
	
	public VOD getVODById(long id)
	{
		return VODDAO.findById(id).orElse(null);
	}
	
	@Override
	public VOD getVODByName(String name)
	{
		return VODDAO.findById(VODDAO.getVODIdFromName(name)).orElse(null);
	}
	
	
	@Override
	public VOD changeVOD(VOD vod)
	{
		VODDAO.saveAndFlush(vod);
		return vod;
	}
	
	@Override
	public VOD addVOD(VOD vod)
	{
		return VODDAO.save(vod);
	}
	
	@Override
	public boolean deleteVOD(long id)
	{
		boolean exists = getVODById(id) != null;
		if (exists)
		{
			VODDAO.delete(getVODById(id));
		}
		return exists;
	}
}
