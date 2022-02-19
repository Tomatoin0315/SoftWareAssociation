package com.example.ruanxieserver.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mailbox implements Serializable {
    private int id;
    private String name;
    private String StuId;
    private String theme;
    private String content;
}
