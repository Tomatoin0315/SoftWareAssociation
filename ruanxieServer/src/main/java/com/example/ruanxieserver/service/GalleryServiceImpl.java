package com.example.ruanxieserver.service;

import com.example.ruanxieserver.mapper.GalleryMapper;
import com.example.ruanxieserver.pojo.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService{

    @Autowired
    private GalleryMapper galleryMapper;

    @Override
    public List<Gallery> getAllGallery() {
        return galleryMapper.getAllGallery();
    }
}
