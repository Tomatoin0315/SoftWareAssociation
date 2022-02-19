package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Sign;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SignMapper {
    public void saveSign(Sign sign);
    public List<Sign> queryAllSign();
}
