package com.retro.dailyRetro.board.controller;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.repository.BoardRepository;
import com.retro.dailyRetro.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BoardController {

    @Autowired
    private BoardService boardService;
    @Autowired
    private BoardRepository repository;

    @PostMapping("/insertBoard")
    public void insertBoard( @RequestBody Board board) {
        boardService.insertBoard(board);
    }

    @GetMapping("/getDailyboard/{date}")
    public List<?> getDailyboard (@PathVariable("date") String date, @RequestHeader("email") String email){
        return boardService.getDailyBoard(date,email);
    }
}
