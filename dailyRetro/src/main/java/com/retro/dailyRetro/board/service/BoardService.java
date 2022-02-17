package com.retro.dailyRetro.board.service;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public void insertBoard(Board board){
        boardRepository.save(board);
    }

    public List<Board> getDailyBoard(String date){
       return boardRepository.findByCreateDate(date);
    }
}
