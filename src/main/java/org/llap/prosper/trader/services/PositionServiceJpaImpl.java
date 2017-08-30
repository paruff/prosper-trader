package org.llap.prosper.trader.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import org.llap.prosper.trader.models.Position;
import org.llap.prosper.trader.repositories.PositionRepository;
import org.llap.prosper.trader.services.PositionService;

@Service
@Primary
public class PositionServiceJpaImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepo;
	
	@Override
	public List<Position> findAll() {
		return this.positionRepo.findAll();
		
	}

	@Override
	public Position findById(Long id) {
		return this.positionRepo.findOne(id);
	}

	@Override
	public Position create(Position position) {
		return null;
	}

	@Override
	public Position edit(Position position) {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}

}
