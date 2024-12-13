package com.example.tarefa.models.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Instant data;

    public Task() {
    }

    public Task(Long id, String title, String description, Status status, Instant data) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }
}

enum Status {
    PENDING, IN_PROGRESS, COMPLETED
}
