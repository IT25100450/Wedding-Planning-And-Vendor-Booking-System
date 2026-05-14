package com.EternalBliss.EternalBliss.controller;

import com.EternalBliss.EternalBliss.model.weddingplanner;
import com.EternalBliss.EternalBliss.Service.weddingplannerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weddingplanner")
@CrossOrigin("*")
public class WeddingplannerController {

    @Autowired
    private weddingplannerservice weddingPlannerService;

    // Get all tasks
    @GetMapping
    public List<weddingplanner> getAllTasks() {
        return weddingPlannerService.getAllTasks();
    }

    // Add a task
    @PostMapping
    public weddingplanner addTask(@RequestBody weddingplanner planner) {
        return weddingPlannerService.saveTask(planner);
    }

    // Update a task
    @PutMapping("/{id}")
    public weddingplanner updateTask(@PathVariable int id, @RequestBody weddingplanner planner) {
        planner.setWeddingplanner_id(id);
        return weddingPlannerService.saveTask(planner);
    }

    // Delete a task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        weddingPlannerService.deleteTask(id);
    }
}
