package com.retro.dailyRetro.board.entity;

import lombok.Data;
import javax.persistence.*;

@Entity // DB Table
@Data //lombok
@Table(name ="quest")
public class Quest {
    @Id
    private String email;
    private String quest;
}
