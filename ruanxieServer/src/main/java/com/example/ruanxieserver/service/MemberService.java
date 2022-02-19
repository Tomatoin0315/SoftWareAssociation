package com.example.ruanxieserver.service;

import com.example.ruanxieserver.pojo.Member;

import java.util.List;

public interface MemberService {
    //获取所有信息
    public List<Member> getAllMemberMsg();

    //获取在招新界面展示的信息
    public List<Member> getShowingMsg();

    //获取成员届数
    public List<Member> getGrade();

    //获取某一届成员
    public List<Member> getMsgByGrade(String grade);
}
