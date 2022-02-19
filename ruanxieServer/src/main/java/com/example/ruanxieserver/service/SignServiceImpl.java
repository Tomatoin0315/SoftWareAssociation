package com.example.ruanxieserver.service;

import com.example.ruanxieserver.mapper.SignMapper;
import com.example.ruanxieserver.pojo.Sign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignMapper signMapper;

    @Override
    public void saveSign(Sign sign) {
        signMapper.saveSign(sign);
    }

    @Override
    public List<Sign> queryAllSign() {
        return signMapper.queryAllSign();
    }
}
