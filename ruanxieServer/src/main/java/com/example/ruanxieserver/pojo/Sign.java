package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sign implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String StuId;
    private String major;
    private String grade;
    private String resume;
}
