package com.EternalBliss.EternalBliss.Service;

import com.EternalBliss.EternalBliss.model.weddingplanner;
import com.EternalBliss.EternalBliss.repository.weddingplannerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class weddingplannerservice {

    @Autowired
    private weddingplannerrepo weddingplannerr;

    public List<weddingplanner> getAllTasks() {
        return weddingplannerr.findAll();
    }

    public weddingplanner saveTask(weddingplanner planner) {
        return weddingplannerr.save(planner);
    }

    public void deleteTask(int id) {
        weddingplannerr.deleteById(id);
    }
}
