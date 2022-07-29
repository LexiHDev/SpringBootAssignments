package net.genspark.restfulAPI2.dao;

import net.genspark.restfulAPI2.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository public interface PlayerDAO extends JpaRepository<Player, Long> {
	
	@Query(value = "SELECT Employee_ID from tbl_employees where Employee_Name = ?1", nativeQuery = true)
	long getPlayerIdFromName(String employee_Name);
}