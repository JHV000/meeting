package com.meeting.service;

import com.meeting.model.MeetingRoom;

import java.util.List;

public interface MeetingRoomService {
    List<MeetingRoom> getAllMr();
    List<MeetingRoom> getMrByName(String name);
    Integer updateRoom(MeetingRoom meetingRoom);
    Integer addMr(MeetingRoom meetingRoom);
    Integer deleteRoom(Integer id);
}
