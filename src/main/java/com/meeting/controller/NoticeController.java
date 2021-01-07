package com.meeting.controller;

import com.meeting.model.Notice;
import com.meeting.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/notices")
public class NoticeController {
   @Autowired
    NoticeService noticeService;
   @RequestMapping("/getallnotices")
   public @ResponseBody
    List<Notice> notices(){
       return noticeService.getAllNo();
   }
   @PostMapping("/addnotice")
    public @ResponseBody Integer addnotice(@RequestBody Notice notice){
       return noticeService.addNotice(notice);
   }
   @PostMapping("/updatenotice")
    public @ResponseBody Integer updatenotice(@RequestBody Notice notice){
       return noticeService.updateNotice(notice);
   }
   @RequestMapping("/deletenotice")
    public @ResponseBody Integer deletenotice(Integer id){
       return noticeService.deleteNotice(id);
   }
}
