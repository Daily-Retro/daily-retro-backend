package com.retro.dailyRetro.board.service;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private QuestService questservice;

    public void insertBoard(Board board){
        boardRepository.save(board);
    }

    public List<?> getDailyBoard(String date, String email){
        List<Board> board = boardRepository.findByCreateDate(date);
        if (board.isEmpty()){
            return questservice.getQuest(email);
        }
       else {
           return board;
        }
    }
}
