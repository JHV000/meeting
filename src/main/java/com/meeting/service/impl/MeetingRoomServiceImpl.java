package com.meeting.service.impl;

import com.meeting.mapper.MeetingRoomMapper;
import com.meeting.model.MeetingRoom;
import com.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeetingRoomServiceImpl implements MeetingRoomService {
    @Autowired
    MeetingRoomMapper meetingRoomMapper;

    public List<MeetingRoom> getAllMr() {
        return meetingRoomMapper.getAllMr();
    }
    public MeetingRoom getMrByName(String name) {
        return meetingRoomMapper.getMrByName(name);
    }
    public Integer updateRoom(MeetingRoom meetingRoom) {
        return meetingRoomMapper.updateRoom(meetingRoom);
    }
    public Integer addMr(MeetingRoom meetingRoom) {
        return meetingRoomMapper.addMr(meetingRoom);
    }
    public Integer deleteRoom(Integer id){
        return meetingRoomMapper.deleteRoom(id);
    }
}
