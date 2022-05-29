package com.example.resetPassword.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountController {

    @GetMapping(value = "/hello")
    public String gethello(){
        return "hello";
    }

    @PostMapping(value = "/reset-password-init")
    public void resetPasswordInit(@RequestBody String email)
        mailService.sendPasswordReset()

}
