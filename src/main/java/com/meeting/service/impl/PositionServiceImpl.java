package com.meeting.service.impl;

import com.meeting.mapper.PositionMapper;
import com.meeting.model.Position;
import com.meeting.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    PositionMapper positionMapper;

    public List<Position> getAllPos() {
        return positionMapper.getAllPos();
    }
    public Integer addPosition(Position position) {
        return positionMapper.addPosition(position);
    }
    public Integer deletePosition(Integer id) {
        return positionMapper.deletePosition(id);
    }
    public Integer updatePosition(Position position) {
        return positionMapper.updatePosition(position);
    }
}
