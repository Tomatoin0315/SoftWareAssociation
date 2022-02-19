package com.example.ruanxieserver.mapper;

import com.example.ruanxieserver.pojo.Testimonials;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestimonialsMapper {
    //获取所有的评价
    public List<Testimonials> getAllTestimonials();
}
