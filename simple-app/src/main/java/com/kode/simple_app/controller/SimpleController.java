package com.kode.simple_app.controller;

import com.kode.simple_app.model.UserDTO;
import com.kode.simple_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class SimpleController {
    private final UserService userService;

    @Autowired
    SimpleController(UserService _userService){
        this.userService = _userService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getById(@PathVariable Long id){
        UserDTO user = new UserDTO("John","Doe",23,id);
        return ResponseEntity.ok(user);
    }
}
