package org.llap.prosper.trader.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.llap.prosper.trader.model.*;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Integer> {

	public Watch findBySymbol(String symbol);

}
