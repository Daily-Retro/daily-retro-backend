package com.retro.dailyRetro.board.repository;

import com.retro.dailyRetro.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer > {
}
