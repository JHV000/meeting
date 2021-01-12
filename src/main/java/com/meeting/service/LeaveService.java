package com.meeting.service;

import com.meeting.model.Leave;

import java.util.List;
import java.util.Map;

public interface LeaveService {
    List<Map> queryAll(int user_id);
    int addLeave(Map<String, Object> map);
    int checkLeave(int id,int status);
    List<Map> showAll();
}
