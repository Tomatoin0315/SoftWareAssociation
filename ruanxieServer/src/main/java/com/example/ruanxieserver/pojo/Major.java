package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Major implements Serializable {
    private int id;
    private String label;
    private String title;
    private String para1;
    private String para2;
    private String imgUrl;
}
