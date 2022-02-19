package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Gallery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GalleryMapper {
    //获取全部生活日常照片
    public List<Gallery> getAllGallery();
}

