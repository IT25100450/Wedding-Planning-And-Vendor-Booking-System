package com.EternalBliss.EternalBliss.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "weddingplanner")
public class weddingplanner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int weddingplanner_id;

    private String taskName;
    private String category;
    private LocalDate dueDate;
    private String notes;
    private boolean done;

    // ── Getters & Setters ──────────────────────────
    public int getWeddingplanner_id() {
        return weddingplanner_id;
    }

    public void setWeddingplanner_id(int weddingplanner_id) {
        this.weddingplanner_id = weddingplanner_id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
