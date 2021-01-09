package com.meeting.service;

import com.meeting.model.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAllPos();

    Integer addPosition(Position position);

    Integer deletePosition(Integer id);

    Integer updatePosition(Position position);
}
