package com.cenfotec.lab5.lab5.service;

import com.cenfotec.lab5.lab5.domain.Journal;
import com.cenfotec.lab5.lab5.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalService {

    @Autowired
    JournalRepository journalRepository;

    public void saveJournal(Journal journal){
        journalRepository.save(journal);
    }

    public List<Journal> getAll(){
        return journalRepository.findAll();
    }

    public Optional<Journal> getById(int id) {
        return journalRepository.findById(Long.valueOf(id));
    }

    public void updateJournal(Journal journal) {
        journalRepository.save(journal);
    }

    public void deleteJournal(int id) {
        journalRepository.deleteById(Long.valueOf(id));
    }
}
