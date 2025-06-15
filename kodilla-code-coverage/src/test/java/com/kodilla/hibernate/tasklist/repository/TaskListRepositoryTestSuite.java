package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private String testListName = "ListName";

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList(testListName, "ListName");
        taskListRepository.save(taskList);

        // When
        List<TaskList> foundTaskLists = taskListRepository.findByListName(testListName);

        // Then
        System.out.println("Found " + foundTaskLists.size() + " task lists for name: '" + testListName + "'");
        assertEquals(1, foundTaskLists.size());
        assertEquals(testListName, foundTaskLists.get(0).getListName());
        assertEquals("ListName", foundTaskLists.get(0).getDescription());

        // CleanUp was made in @AfterEach section :)
    }
    @AfterEach
    public void cleanup() {

        List<TaskList> foundTaskLists = taskListRepository.findByListName(testListName);
        if (!foundTaskLists.isEmpty()) {
            taskListRepository.deleteAll(foundTaskLists);
            System.out.println("Cleanup: " + foundTaskLists.size() + " TaskList has been deleted'" + testListName + "'.");
        }
    }

}