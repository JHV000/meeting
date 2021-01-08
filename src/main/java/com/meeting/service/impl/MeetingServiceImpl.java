package com.meeting.service.impl;
import com.meeting.mapper.MeetingMapper;
import com.meeting.model.Meeting;
import com.meeting.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MeetingServiceImpl implements MeetingService {
    @Autowired
    private MeetingMapper meetingMapper;

    @Override
    public List<Meeting> queryAll() {
        return meetingMapper.queryAll();
    }

    @Override
    public List<Meeting> queryAllById(int user_id) {
        return meetingMapper.queryAllById(user_id);
    }

    @Override
    public int addMeeting(Map<String, Object> map) {
        return meetingMapper.addMeeting(map);
    }

    @Override
    public int checkMeeting(int id,int status) {
        return meetingMapper.checkMeeting(id,status);
    }
}
