package com.example.page.study;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Study {
    @Id
    private long studyId;
    private String studyTitle;
    private String studyBody;
    private String studyImg;

    private long subjectId;

    //플랜과 상호작용하도록 넣어야 함

}
