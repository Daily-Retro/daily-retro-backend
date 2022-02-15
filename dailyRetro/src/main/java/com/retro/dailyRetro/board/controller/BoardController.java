package com.retro.dailyRetro.board.controller;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/insertBoard")
    public void insertBoard( @RequestBody Board board) {
        boardService.insertBoard(board);
    }

}
