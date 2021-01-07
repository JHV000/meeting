package com.meeting.mapper;

import java.util.List;

import com.meeting.model.MeetingRoom;

public interface MeetingRoomMapper {
    List<MeetingRoom> getAllMr();
    MeetingRoom getMrById(Integer id);
    Integer updateRoom(MeetingRoom meetingRoom);

    Integer addMr(MeetingRoom meetingRoom);
}
