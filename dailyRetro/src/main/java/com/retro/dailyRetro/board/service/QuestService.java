package com.retro.dailyRetro.board.service;

import com.retro.dailyRetro.board.entity.Quest;
import com.retro.dailyRetro.board.repository.QuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestService {
    @Autowired
    private QuestRepository questRepository;

    public List<?> getQuest(String email){
        return  questRepository.findByEmail(email);
    }
}
