package com.darkwizz.routine.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.darkwizz.routine.data.RoutineRepo;

import java.util.List;

public class TaskViewModel extends AndroidViewModel {
    public static RoutineRepo repo;
    public final LiveData<List<Task>> allTasks;

    public TaskViewModel(@NonNull Application application) {
        super(application);
        repo = new RoutineRepo(application);
        allTasks = repo.getAllTasks();
    }

    public LiveData<List<Task>> getAllTasks() {
        return allTasks;
    }
    public static void insert(Task task){
        repo.insert(task);
    }
    public LiveData<Task> get(long id){
        return repo.get(id);
    }
    public static void update(Task task){
        repo.update(task);
    }
    public static void delete(Task task){
        repo.delete(task);
    }
}
