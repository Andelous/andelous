package com.angeld.azurehomepage.model.todo;

import java.util.List;

public class Task {
    private Integer id;

    private String userId;
    private String title;
    private String description;
    private TaskStatus status;

    private Task parentTask;
    private List<Task> childTasks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parenTask) {
        this.parentTask = parenTask;
    }

    public List<Task> getChildTasks() {
        return childTasks;
    }

    public void setChildTasks(List<Task> childTasks) {
        this.childTasks = childTasks;
    }

}
