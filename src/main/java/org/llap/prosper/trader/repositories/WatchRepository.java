package org.llap.prosper.trader.repositories;

import java.util.List;

import org.llap.prosper.trader.models.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Integer> {
	@Query("SELECT w FROM Watch w ")
	List<Watch> findAll();
	
	public Watch findBySymbol(String symbol);
}
