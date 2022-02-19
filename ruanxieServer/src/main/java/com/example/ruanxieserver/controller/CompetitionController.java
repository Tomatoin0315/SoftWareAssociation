package com.example.ruanxieserver.controller;

import com.example.ruanxieserver.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompetitionController {
    @Autowired
    private CompetitionService competitionService;

    //获取比赛信息
    @GetMapping("/competition/getCompetitionMsg")
    public Object getCompetitionMsg() {
        return competitionService.getCompetitionMsg();
    }
}
