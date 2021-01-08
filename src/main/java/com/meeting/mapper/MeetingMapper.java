package com.meeting.mapper;
import com.meeting.model.Meeting;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MeetingMapper {
    List<Meeting> queryAll();
    List<Meeting> queryAllById(int user_id);
    int addMeeting(Map<String, Object> map);
    int checkMeeting(@Param("id") int id,@Param("status") int status);

}
