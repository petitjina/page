package com.example.page.hobby;


import jakarta.persistence.Id;

public class Hobby {
    @Id
    private long hobbyId;
    private String hobbyTitle;
    private String hobbyBody;
    private String hobbyImg; //이미지를 url형태의 String으로 저장

    private long categoryId; //취미를 종류(뜨개질,운동 등)에 따라 카테고리 분류

    //달력과 상호작용하도록 날짜 넣어야 함
}
