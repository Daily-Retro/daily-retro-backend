package com.retro.dailyRetro.board.service;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void insertBoard(Board board){
        boardRepository.save(board);
    }
}
