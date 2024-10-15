package com.hyunu.carrot.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity @Getter
public class Product extends AuditingFields{

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private int views;

    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

}
