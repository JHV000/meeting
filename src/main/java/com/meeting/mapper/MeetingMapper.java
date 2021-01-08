package com.meeting.mapper;
import com.meeting.model.Meeting;
import java.util.List;
import java.util.Map;

public interface MeetingMapper {
    List<Meeting> queryAll();
    List<Meeting> queryAllById(int user_id);
    int addMeeting(Map<String, Object> map);
    int checkMeeting(int id);

}
