package org.llap.prosper.trader.services;

import java.util.List;

import org.llap.prosper.trader.models.Watch;

public interface WatchService {
	List<Watch> findAll();

	Watch findById(int id);

	Watch create(Watch watch);

	Watch edit(Watch watch);

	void deleteById(int id);

	Iterable<Watch> listAllWatches();

	Watch saveWatch(Watch watch);
}