package com.hyunu.carrot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter
public class Address {

    @Id @GeneratedValue
    private Long id;

    @Setter
    private String siDo;            // 시 도

    @Setter
    private String siGunGu;         // 시 군 구

    @Setter
    private String eupMyeonDong;    // 읍 면 동
}
