package com.example.ruanxieserver.controller;

import com.example.ruanxieserver.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;

    //获取所有成员信息
    @GetMapping("/member/getAllMsg")
    public Object getAllMsg() {
        return memberService.getAllMemberMsg();
    }

    //获取在招新界面展示的信息
    @GetMapping("/member/getAllShowing")
    public Object getShowing() {
        return memberService.getShowingMsg();
    }

    //获取成员届数(去重后)
    @GetMapping("/member/getGrade")
    public Object getGrade() {
        return memberService.getGrade();
    }

    //获取某一届成员
    @GetMapping("/member/getMsgByGrade")
    public Object getMsgByGrade(HttpServletRequest req) {
        String grade = req.getParameter("grade");
        return memberService.getMsgByGrade(grade);
    }
}
