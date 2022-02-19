package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    private int id;
    private String name;
    private String label;
    private String major;
    private String phone;
    private String StuId;
    private String grade;
    private String imgUrl;
}
