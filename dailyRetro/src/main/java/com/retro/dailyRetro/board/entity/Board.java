package com.retro.dailyRetro.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // DB Table
@Data //lombok
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String email;
    private String emoji;
    private String quest;
    private String contents;
    private String createDate;
}
