package com.meeting.mapper;

import java.util.List;

import com.meeting.model.MeetingRoom;

public interface MeetingRoomMapper {
    List<MeetingRoom> getAllMr();
    List<MeetingRoom> getMrByName(String name);
    Integer updateRoom(MeetingRoom meetingRoom);

    Integer addMr(MeetingRoom meetingRoom);

    Integer deleteRoom(Integer id);
}
