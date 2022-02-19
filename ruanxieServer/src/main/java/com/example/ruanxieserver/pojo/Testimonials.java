package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Testimonials implements Serializable {
    private int id;
    private String imgUrl;
    private String name;
    private String label;
    private String description;
}
