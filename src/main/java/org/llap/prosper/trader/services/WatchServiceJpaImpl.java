package org.llap.prosper.trader.services;

import java.util.List;

import org.llap.prosper.trader.models.Watch;
import org.llap.prosper.trader.repositories.WatchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class WatchServiceJpaImpl implements WatchService {

    @Autowired
    private WatchRepository watchRepo;
	
	@Override
	public List<Watch> findAll() {
		return this.watchRepo.findAll();
	}

	
    @Override
    public Iterable<Watch> listAllWatches() {
        return watchRepo.findAll();
    }
    
	@Override
	public Watch findById(Long id) {
		return this.watchRepo.findOne(id);
	}

	/*@Override
	public Watch findBySymbol(String symbol) {
		return this.watchRepo.findOne(symbol);
	}*/
	
	@Override
	public Watch create(Watch position) {
		
		return null;
	}

	@Override
	public Watch edit(Watch position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

}


