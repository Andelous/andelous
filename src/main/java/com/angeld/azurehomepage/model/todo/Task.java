package com.angeld.azurehomepage.model.todo;

import java.util.List;

public class Task {
    private TaskStatus status;
    private String title;
    private String description;

    private Task parenTask;
    private List<Task> childTasks;

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
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

    public Task getParenTask() {
        return parenTask;
    }

    public void setParenTask(Task parenTask) {
        this.parenTask = parenTask;
    }

    public List<Task> getChildTasks() {
        return childTasks;
    }

    public void setChildTasks(List<Task> childTasks) {
        this.childTasks = childTasks;
    }

}
