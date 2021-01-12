package com.meeting.service;

import com.meeting.model.Leave;

import java.util.List;
import java.util.Map;

public interface LeaveService {
    List<Leave> queryAll(int id);
    int addLeave(Map<String, Object> map);
    int checkLeave(int id,int status);
    List<Leave> showAll();
}
