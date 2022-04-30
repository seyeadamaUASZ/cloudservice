package com.sid.gl.controller;

import com.sid.gl.VO.ResponseTemplateVO;
import com.sid.gl.entity.User;
import com.sid.gl.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
@Slf4j
public class UserController {

    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        log.info("save user !!!");
        return userService.saveUser(user);
    }

    @GetMapping("{id}")
    public ResponseTemplateVO getUserWithDepartement(@PathVariable("id") Long id){
       log.info("get user with departement");
       return userService.getUserWithDepartement(id);
    }

}
