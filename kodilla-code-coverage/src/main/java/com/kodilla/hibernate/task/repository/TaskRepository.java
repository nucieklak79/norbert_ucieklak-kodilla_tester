package com.kodilla.hibernate.task.repository;
mport com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.Task;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public interface TaskRepository extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
