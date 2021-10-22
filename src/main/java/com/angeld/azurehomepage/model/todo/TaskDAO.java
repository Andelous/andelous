package com.angeld.azurehomepage.model.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TaskDAO {
    public List<Task> getTasks(String userId) {
        List<Task> list = new ArrayList<>();

        return list;
    }
}
