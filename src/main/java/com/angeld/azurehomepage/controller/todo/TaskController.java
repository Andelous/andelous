package com.angeld.azurehomepage.controller.todo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.angeld.azurehomepage.model.todo.Task;
import com.angeld.azurehomepage.model.todo.TaskDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Main controller for the To-do application.
 * </p>
 * 
 * <p>
 * We consider the user to be only in the scope in the session, that's why we
 * are using the Session ID as the User ID.
 * </p>
 */
@RequestMapping(path = "/todo/task")
@RestController
public class TaskController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskDAO taskDAO;

    /**
     * Gets all the tasks associated with the user.
     * 
     * @param request Servlet request provided by Spring.
     * 
     * @return List of tasks associated with the user.
     */
    @GetMapping
    public List<Task> getTasks(HttpServletRequest request) {
        String userId = request.getSession().getId();

        LOGGER.debug("GET ALL TASKS FOR USER | UserID {} ", userId);

        List<Task> list = taskDAO.getTasks(userId);

        return list;
    }

    /**
     * Retrieves a task based on the ID of the Task.
     * 
     * @param id       ID of the Task.
     * @param request  Servlet request provided by Spring.
     * @param response Servlet response provided by Spring.
     * @return Matching Task.
     */
    @GetMapping(path = "{id}")
    public Task getTask(@PathVariable("id") int id, HttpServletRequest request, HttpServletResponse response) {
        String userId = request.getSession().getId();

        LOGGER.debug("GET SINGLE TASK | UserID {} TaskID {}", userId, id);

        Task task = taskDAO.getTask(id);

        // If no task found, return nothing...
        if (task == null)
            return task;

        // If the user is the owner of the task, return it...
        if (task.getUserId().equalsIgnoreCase(userId))
            return task;

        // Else, deny access to the resource
        LOGGER.warn("FORBIDDEN RESOURCE | UserID {} TaskID {}", userId, id);
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);

        return null;
    }

    /**
     * Inserts a Task under the currently active user.
     * 
     * @param task Task information provided by the user.
     * 
     * @return Task with the corresponding ID in the DB.
     */
    @PostMapping
    private Task postTask(Task task, HttpServletRequest request) {
        return null;
    }
}
