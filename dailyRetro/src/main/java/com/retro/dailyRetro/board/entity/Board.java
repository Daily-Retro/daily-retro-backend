package com.retro.dailyRetro.board.entity;

import lombok.Data;
import javax.persistence.*;

@Entity // DB Table
@Data //lombok
@Table(name ="board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String email;
    private String emoji;
    private String quest;
    private String quest_answer;
    private String contents;
    private String createDate;
}
