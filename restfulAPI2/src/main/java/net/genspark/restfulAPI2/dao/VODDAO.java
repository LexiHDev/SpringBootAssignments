package net.genspark.restfulAPI2.dao;

import net.genspark.restfulAPI2.entities.VOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VODDAO extends JpaRepository<VOD, Long>
{
	
	@Query(value = "SELECT VOD_ID from tbl_vods where VOD_Name = ?1", nativeQuery = true)
	long getVODIdFromName(String VOD_Name);
}