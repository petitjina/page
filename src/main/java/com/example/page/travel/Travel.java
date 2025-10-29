package com.example.page.travel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Travel {
    @Id
    private long travelId;
    private String travelTitle;
    private String travelBody;
    private String travelImg;

    private long countryId;

    //달력과 상호작용하도록 날짜 넣어야 함
}
