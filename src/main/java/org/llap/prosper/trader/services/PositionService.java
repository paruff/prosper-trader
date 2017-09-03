package org.llap.prosper.trader.services;

import java.util.List;

import org.llap.prosper.trader.models.Position;

public interface PositionService {
    List<Position> findAll();
    Position findById(int id);
    Position create(Position position);
    Position edit(Position position);
    void deleteById(int id);
	void savePosition(Position position);

}