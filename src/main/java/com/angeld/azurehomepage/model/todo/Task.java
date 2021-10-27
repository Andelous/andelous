package com.angeld.azurehomepage.model.todo;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task {
    private Integer id;

    private String userId;
    private String title;
    private String description;
    private TaskStatus status;

    private Integer parentTaskId;

    private Task parentTask;
    private Set<Task> childTasks;

    public Task() {
        childTasks = new LinkedHashSet<>();
    }

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

    public Integer getParentTaskId() {
        return parentTaskId;
    }

    public void setParentTaskId(Integer parentTaskId) {
        this.parentTaskId = parentTaskId;
    }

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parenTask) {
        this.parentTask = parenTask;
    }

    /**
     * Returns an unmodifiable view of the child tasks belonging to this task.
     * {@link LinkedHashSet} is the underlying implementation of the list containing
     * the tasks.
     * 
     * @return List of tasks belonging to this task.
     */
    public List<Task> getChildTasks() {
        return Collections.unmodifiableList(childTasks.stream().collect(Collectors.toList()));
    }

    /**
     * Tries adding the specified task to the list of child tasks.
     * 
     * @param childTask Child task to add. Not <code>null</code>.
     * @return <code>true</code> if the task wasn't already contained in the child
     *         task list. <code>false</code> otherwise.
     */
    public boolean addChildTask(Task childTask) {
        if (childTask == null)
            throw new NullPointerException("New child tasks can't be null");

        return childTasks.add(childTask);
    }

    /**
     * 
     * @param childTask Child task to remove. Not <code>null</code>.
     * @return <code>true</code> if the task was contained in the child task list.
     *         <code>false</code> otherwise.
     */
    public boolean removeChildTask(Task childTask) {
        if (childTask == null)
            throw new NullPointerException("Can't remove null tasks from the children list");

        return childTasks.remove(childTask);
    }
}
