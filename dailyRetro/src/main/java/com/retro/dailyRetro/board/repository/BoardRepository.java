package com.retro.dailyRetro.board.repository;

import com.retro.dailyRetro.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer > {
    public List<Board> findByCreateDate(String createDate);
}
