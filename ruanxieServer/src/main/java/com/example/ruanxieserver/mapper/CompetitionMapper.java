package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Competition;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompetitionMapper {
    //获取比赛信息
    public List<Competition> getCompetitionMsg();
}
