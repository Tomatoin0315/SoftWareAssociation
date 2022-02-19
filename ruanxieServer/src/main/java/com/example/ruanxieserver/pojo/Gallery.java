package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gallery implements Serializable {
    private int id;
    private String imgUrl;
}
