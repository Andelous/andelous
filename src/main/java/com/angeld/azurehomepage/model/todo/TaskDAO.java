package com.angeld.azurehomepage.model.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TaskDAO {
    // ------------------------------------
    //
    // GET
    //
    // ------------------------------------

    /**
     * Searches all the tasks for a specific user.
     * 
     * @param userId ID that identifies the user.
     * @return List of tasks belonging to that user.
     */
    public List<Task> getTasks(String userId) {
        List<Task> list = new ArrayList<>();

        // TODO: Implement

        return list;
    }

    /**
     * Fetches a single task based on the ID of the task.
     * 
     * @param id ID of the task.
     * @return Matching task.
     */
    public Task getTask(int id) {
        Task task = null;

        // TODO: Implement

        return task;
    }

    // ------------------------------------
    //
    // INSERT
    //
    // ------------------------------------

    public Task insertTask(Task task) {

    }

    // ------------------------------------
    //
    // UPDATE
    //
    // ------------------------------------
}
