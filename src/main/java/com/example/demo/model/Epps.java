package com.example.demo.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
@Data
public class Epps {

    private Long seq;  // 순번 (자동 생성)

    private String company;  // 회사명

    private Date reg_Date;  // 등록일자

    private String reg_User;  // 등록자

    private String title;  // 제목

    private String content;  // 게시글 내용

    private String password;
}
