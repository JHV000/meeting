package com.meeting.service;

import com.meeting.model.Leave;

import java.util.List;
import java.util.Map;

public interface LeaveService {
    List<Leave> queryAll(int user_id);
    int addLeave(Map<String, Object> map);
    int checkLeave(int id);
    List<Leave> showAll(int index);
}
