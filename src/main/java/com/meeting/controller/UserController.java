package com.meeting.controller;

import com.meeting.model.User;
import com.meeting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * controller层
 * 接受前端传来的参数，进行业务操作
 * 返回一个路径或数据表
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/queryUser")
    public @ResponseBody
    int queryUser(@RequestBody Map<String, Object> map) {

        int flag = userService.queryUser(map);
        if (flag == 1) {
            System.out.println("登录成功");

        } else {
            System.out.println("登录失败");
        }
        return flag;

    }


    @PostMapping("/adduser")
    public @ResponseBody
    int addUser(@RequestBody Map<String, Object> map) {
        return userService.addUser(map);

    }

    @PostMapping("/updateuser")
    public @ResponseBody
    int update(@RequestBody Map<String, Object> map) {

        return userService.update(map);

    }


    @GetMapping("/selectuser")
    public @ResponseBody
    User query(@RequestParam int id) {
        return userService.query(id);
    }

    @GetMapping("/deleteuser")
    public @ResponseBody
    int deleteUser(@RequestParam int id) {
        return userService.deleteUser(id);
    }

    @GetMapping("/queryAlluser")
    public @ResponseBody
    List<User> queryAll() {
        return userService.queryAll();
    }

    @GetMapping("/searchuser")
    public @ResponseBody
    List<User> search(@RequestParam String chara) {
        return userService.search(chara);
    }

}