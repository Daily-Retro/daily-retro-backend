package com.retro.dailyRetro.board.controller;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/insertBoard")
    public void insertBoard(@RequestBody Board board) {
        boardService.insertBoard(board);
    }

}
