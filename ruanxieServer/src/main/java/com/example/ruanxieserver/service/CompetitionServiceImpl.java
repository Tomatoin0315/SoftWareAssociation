package com.example.ruanxieserver.service;

import com.example.ruanxieserver.mapper.CompetitionMapper;
import com.example.ruanxieserver.pojo.Competition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionServiceImpl implements CompetitionService{

    @Autowired
    private CompetitionMapper competitionMapper;

    @Override
    public List<Competition> getCompetitionMsg() {
        return competitionMapper.getCompetitionMsg();
    }
}
