package se.me0nly.data;

import se.me0nly.model.TodoItem;

import java.util.Collection;
import java.util.Optional;

public interface TodoItemsImple {
    TodoItem create (TodoItem todoitem);

    Collection<TodoItem> findAll ();

    TodoItem findById(Integer id);


    boolean findAllByDoneStatus(boolean done);

    Optional<TodoItem> findByAssignee (TodoItem person);

    TodoItem findByUnassignedTodoItem();

    void update(TodoItem toupdate);

    boolean remove (Integer id);

}
