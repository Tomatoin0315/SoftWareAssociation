package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Competition implements Serializable {
    private int id;
    private String imgUrl;
    private String title;
    private String para1;
    private String para2;
    private String para3;
}
