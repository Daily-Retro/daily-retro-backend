package com.retro.dailyRetro.board.repository;

import com.retro.dailyRetro.board.entity.Board;
import com.retro.dailyRetro.board.entity.Quest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestRepository extends JpaRepository<Quest, String > {
    public List<Quest> findByEmail(String email);
}
