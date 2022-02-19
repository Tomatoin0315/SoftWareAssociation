package com.example.ruanxieserver.controller;

import com.example.ruanxieserver.service.TestimonialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestimonialsController {

    @Autowired
    private TestimonialsService testimonialsService;

    //获取成员评价信息
    @GetMapping("/testimonials/getAll")
    public Object getAllTestimonials() {
        return testimonialsService.getAllTestimonials();
    }
}
