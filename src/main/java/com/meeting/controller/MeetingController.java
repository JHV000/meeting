package com.meeting.controller;
import com.meeting.model.Meeting;
import com.meeting.service.MeetingService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/meeting")
public class MeetingController {

    @Autowired
    MeetingService meetingService;
    @GetMapping(value = "/queryAll")
    public @ResponseBody
    List<Meeting> queryAll() {
        return meetingService.queryAll();
    }
    @PostMapping("/addmeeting")
    public @ResponseBody
    Integer addmeeting(@RequestBody Map<String, Object> map){
        return meetingService.addMeeting(map);
    }
    @GetMapping("/queryAllById")
    public @ResponseBody
    List<Meeting> queryAllById(int user_id){
        return meetingService.queryAllById(user_id);
    }
    @GetMapping("/checkmeeting")
    public @ResponseBody int checkmeeting(@RequestParam int id,int status){
        return meetingService.checkMeeting(id,status);
    }
}
