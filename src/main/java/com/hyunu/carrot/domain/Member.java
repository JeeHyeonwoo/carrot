package com.hyunu.carrot.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity @Getter
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private int mannerPoint;        // 매너 점수

    @Setter
    private String siDo;            // 시 도

    @Setter
    private String siGunGu;         // 시 군 구

    @Setter
    private String eupMyeonDong;    // 읍 면 동

    @Setter
    private String detailAddress;   // 상세 주소

    @Setter
    private int postCode;           // 우편번호

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private Set<Product> productList = new LinkedHashSet<>();
}
