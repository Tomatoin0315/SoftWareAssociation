package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Major;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MajorMapper {
    //获取软协的主修方向信息
    public List<Major> getMajorMsg();
}
