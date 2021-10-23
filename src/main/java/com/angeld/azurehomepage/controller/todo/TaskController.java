package com.angeld.azurehomepage.controller.todo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.angeld.azurehomepage.model.todo.Task;
import com.angeld.azurehomepage.model.todo.TaskDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main controller for the To-do application.
 */
@RequestMapping(path = "/todo/task")
@RestController
public class TaskController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    private TaskDAO taskDAO;

    /**
     * Gets all the tasks associated with the session.
     * 
     * @param request Servlet request provided by Spring.
     * 
     * @return List of tasks associated with the Session.
     */
    @GetMapping
    public List<Task> getTasks(HttpServletRequest request) {
        String id = request.getSession().getId();

        LOGGER.debug("GET ALL TASKS | User {} ", id);

        List<Task> list = taskDAO.getTasks(id);

        return list;
    }
}
