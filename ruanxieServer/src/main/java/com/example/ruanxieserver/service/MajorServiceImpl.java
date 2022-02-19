package com.example.ruanxieserver.service;

import com.example.ruanxieserver.mapper.MajorMapper;
import com.example.ruanxieserver.pojo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService{

    @Autowired
    private MajorMapper majorMapper;

    //获取软协主修方向
    @Override
    public List<Major> getMajorMsg() {
        return majorMapper.getMajorMsg();
    }
}
