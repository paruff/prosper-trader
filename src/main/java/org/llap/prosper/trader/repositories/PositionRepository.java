package org.llap.prosper.trader.repositories;

import java.util.List;

import org.llap.prosper.trader.models.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

	@Repository
	public interface PositionRepository extends
	        JpaRepository<Position, Long> {
	    @Query("SELECT p FROM Position p ")
	    List<Position> findAll();
	}




