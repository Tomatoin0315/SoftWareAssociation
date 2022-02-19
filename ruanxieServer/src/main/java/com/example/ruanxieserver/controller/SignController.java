package com.example.ruanxieserver.controller;

import com.example.ruanxieserver.pojo.Sign;
import com.example.ruanxieserver.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SignController {

    @Autowired
    private SignService saveServiceImpl;

    //添加报名者信息
    @PostMapping("/sign/add")
    public void saveSign(Sign sign){
        saveServiceImpl.saveSign(sign);
    }

    //获取所有报名者信息
    @GetMapping("/sign/getAll")
    public Object getAllSign(){
        return saveServiceImpl.queryAllSign();
    }

}
