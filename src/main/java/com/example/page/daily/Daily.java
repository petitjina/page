package com.example.page.daily;

import jakarta.persistence.Entity; //javax -> jakarta 로 변경됨
import jakarta.persistence.Id;


@Entity
public class Daily {
    @Id
    private long dailyId;
    private String dailyTitle;
    private String dailyBody;

    //달력과 상호작용하도록 날짜 넣어야 함
}
