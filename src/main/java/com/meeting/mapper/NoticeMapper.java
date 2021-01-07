package com.meeting.mapper;

import com.meeting.model.Notice;

import java.util.List;

public interface NoticeMapper {
    List<Notice> getAllNo();

    Integer addNotice(Notice notice);

    Integer updateNotice(Notice notice);

    Integer deleteNotice(Integer id);
}
