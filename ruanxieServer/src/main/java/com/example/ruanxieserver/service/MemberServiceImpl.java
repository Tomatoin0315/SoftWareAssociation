package com.example.ruanxieserver.service;

import com.example.ruanxieserver.mapper.MemberMapper;
import com.example.ruanxieserver.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> getAllMemberMsg() {
        return memberMapper.getAllMemberMsg();
    }

    @Override
    public List<Member> getShowingMsg() {
        return memberMapper.getShowingMsg();
    }

    @Override
    public List<Member> getGrade() {
        return memberMapper.getGrade();
    }

    @Override
    public List<Member> getMsgByGrade(String grade) {
        return memberMapper.getMsgByGrade(grade);
    }
}
