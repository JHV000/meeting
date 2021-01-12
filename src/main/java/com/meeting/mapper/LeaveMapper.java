package com.meeting.mapper;

import com.meeting.model.Leave;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LeaveMapper {
    List<Map> queryAll(int user_id);
    int checkLeave(@Param("id") int id,@Param("status") int status);
    int addLeave(Map<String, Object> map);
    List<Map> showAll();
}
