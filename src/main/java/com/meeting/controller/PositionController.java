package com.meeting.controller;

import com.meeting.model.Position;
import com.meeting.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/positions")
public class PositionController {
    @Autowired
    PositionService positionService;

    @RequestMapping("/getallposition")
    public @ResponseBody
    List<Position> getallposition() {
        return positionService.getAllPos();
    }

    @PostMapping("/addposition")
    public @ResponseBody
    Integer addposition(@RequestBody Position position) {
        return positionService.addPosition(position);
    }

    @RequestMapping("/deleteposition")
    public @ResponseBody
    Integer deleteposition(Integer id) {
        return positionService.deletePosition(id);
    }

    @PostMapping("/updateposition")
    @ResponseBody
    public Integer updateposition(@RequestBody Position position) {
        return positionService.updatePosition(position);

    }
}
