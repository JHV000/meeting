package com.meeting.service.impl;

import com.meeting.mapper.NoticeMapper;
import com.meeting.model.Notice;
import com.meeting.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    @Override
    public List<Notice> getAllNo() {
        return noticeMapper.getAllNo();
    }

    @Override
    public Integer addNotice(Notice notice) {
        return noticeMapper.addNotice(notice);
    }

    @Override
    public Integer updateNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }

    @Override
    public Integer deleteNotice(Integer id) {
        return noticeMapper.deleteNotice(id);
    }
}
