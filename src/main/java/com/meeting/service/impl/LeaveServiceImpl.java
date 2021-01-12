package com.meeting.service.impl;

import com.meeting.mapper.LeaveMapper;
import com.meeting.model.Leave;
import com.meeting.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveMapper leaveMapper;



    @Override
    public List<Leave> queryAll(int id) {

        return leaveMapper.queryAll(id);
    }

    @Override
    public int addLeave(Map<String, Object> map) {
        return leaveMapper.addLeave(map);
    }

    @Override
    public int checkLeave(int id,int status) {
        return leaveMapper.checkLeave(id,status);
    }

    @Override
    public List<Leave> showAll() {
        return leaveMapper.showAll();
    }

}
