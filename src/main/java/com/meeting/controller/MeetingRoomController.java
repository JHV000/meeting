package com.meeting.controller;

import com.meeting.model.MeetingRoom;
import com.meeting.service.MeetingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/meetingrooms")
public class MeetingRoomController {
    @Autowired
    MeetingRoomService meetingRoomService;

    @RequestMapping("/getallrooms")
    public @ResponseBody List<MeetingRoom> meetingrooms() {

        return meetingRoomService.getAllMr();
    }
    @RequestMapping("/getroombyname")
    public @ResponseBody List<MeetingRoom> roomdetails(String name) {
        return meetingRoomService.getMrByName(name);
    }
    @PostMapping("/updateroom")
    public @ResponseBody Integer updateRoom(@RequestBody MeetingRoom meetingRoom) {
        return meetingRoomService.updateRoom(meetingRoom);
    }
//    @RequestMapping("/addmeetingroom")
//    public @ResponseBody String addmeetingroom() {
//        return "addmeetingroom";
//    }

    @PostMapping("/addroom")
    public @ResponseBody Integer doAddMr(@RequestBody MeetingRoom meetingRoom) {
        return meetingRoomService.addMr(meetingRoom);
    }
    @RequestMapping("/deleteroom")
    public @ResponseBody Integer deleteRoom(Integer id){
        return meetingRoomService.deleteRoom(id);
    }
}
