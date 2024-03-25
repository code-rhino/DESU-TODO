package com.example.demo.domain.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TaskService {

    private TaskRepo taskRepo;

    @Autowired
    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> findAllTask(){
        return taskRepo.findAll();
    }

    public Task saveTask(Task task){
        task.setCompleted(false);
        return taskRepo.save(task);
    }
}
