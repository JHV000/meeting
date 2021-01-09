package com.meeting.mapper;

import com.meeting.model.Position;

import java.util.List;

public interface PositionMapper {
    List<Position> getAllPos();

    Integer addPosition(Position position);

    Integer deletePosition(Integer id);

    Integer updatePosition(Position position);
}
