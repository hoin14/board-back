package com.board.boardback.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "contents")
    private String contents;

    @Column(name = "member_no")
    private Integer memberNo;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    @Column(name = "likes")
    private Integer likes;

    @Column(name = "counts")
    private Integer counts;
}
