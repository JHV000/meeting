package com.meeting.service;

import com.meeting.model.MeetingRoom;

import java.util.List;

public interface MeetingRoomService {
    List<MeetingRoom> getAllMr();
    MeetingRoom getMrById(Integer id);
    Integer updateRoom(MeetingRoom meetingRoom);
    Integer addMr(MeetingRoom meetingRoom);
}
