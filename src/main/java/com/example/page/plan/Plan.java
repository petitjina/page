package com.example.page.plan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Plan {
    @Id
    private long planId;
    private String planTitle;
    private String planBody;

    private long status;// 할 일-1, 하는 중-2, 완료-3 으로 부여
    private long tagId; // 할일을 공부, 취미, 약속 등 태그를 부여

    //달력과 상호작용하도록 날짜 넣어야 함(그 외, 취미, 공부, 여행과 상호작용)

}
