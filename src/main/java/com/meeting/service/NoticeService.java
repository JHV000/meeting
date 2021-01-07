package com.meeting.service;


import com.meeting.model.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getAllNo();
    Integer addNotice(Notice notice);
    Integer updateNotice(Notice notice);
    Integer deleteNotice(Integer id);
}
