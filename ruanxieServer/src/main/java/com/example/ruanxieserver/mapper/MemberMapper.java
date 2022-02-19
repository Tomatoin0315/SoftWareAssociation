package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberMapper {
    //获取所有信息
    public List<Member> getAllMemberMsg();

    //获取在招新界面展示的信息
    public List<Member> getShowingMsg();

    //获取成员届数
    public List<Member> getGrade();

    //获取某一届成员
    public List<Member> getMsgByGrade(String grade);
}
