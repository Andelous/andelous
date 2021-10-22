package com.angeld.azurehomepage.controller.todo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.angeld.azurehomepage.model.todo.Task;
import com.angeld.azurehomepage.model.todo.TaskDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main controller for the To-do application.
 * 
 * We deal with tasks. Each task can be in a certain state
 * 
 */
@RequestMapping(path = "/todo/task")
@RestController
public class TaskController {
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

        List<Task> list = taskDAO.getTasks(id);

        return list;
    }
}
