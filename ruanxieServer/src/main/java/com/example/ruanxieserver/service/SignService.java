package com.example.ruanxieserver.service;

import com.example.ruanxieserver.pojo.Sign;

import java.util.List;

public interface SignService {
    public void saveSign(Sign sign);
    public List<Sign> queryAllSign();
}
