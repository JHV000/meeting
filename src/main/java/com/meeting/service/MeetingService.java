package com.meeting.service;

import com.meeting.model.Meeting;
import org.omg.CORBA.INTERNAL;


import java.util.List;
import java.util.Map;
public interface MeetingService {
    List<Meeting> queryAll();
    List<Meeting> queryAllById(int user_id);
    int addMeeting(Map<String, Object> map);
    int checkMeeting(int id,int status);
}
