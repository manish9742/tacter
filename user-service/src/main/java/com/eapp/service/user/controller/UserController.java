package com.eapp.service.user.controller;

import com.eapp.service.user.entity.UserInfo;
import com.eapp.service.user.service.UserService;
import com.eapp.service.user.valueObject.ReposeTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserInfo saveUser(@RequestBody UserInfo user){
        log.info("inside save user");
        return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public Optional<ReposeTemplateVo> getUserWithDepartment(@PathVariable("id") Long id){
        log.info("Inside the get mapping");
        return userService.getuserWityDepartment(id);
    }



}
