package com.qianxunclub.permanent.controller;


import com.qianxunclub.permanent.service.LoginService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@AllArgsConstructor
public class AuthController {

    private LoginService loginService;

    @GetMapping("login")
    public String login(@RequestParam String authType
    ) {
        return loginService.login(authType);
    }

    @GetMapping
    public void callback(
            @RequestParam String code,
            @RequestParam String state
    ) {
        loginService.callback(code, state);
    }
}
