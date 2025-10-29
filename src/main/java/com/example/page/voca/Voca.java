package com.example.page.voca;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Voca {
    @Id
    private long vocaId;
    private String voca;
    private String meaning;
    private String korean;

    private long studyId;

    //스터디와 상호작용하도록 넣어야 함
}
