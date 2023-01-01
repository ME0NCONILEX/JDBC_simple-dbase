package se.me0nly.dao;

import se.me0nly.model.TodoItem;

import java.util.List;

public interface TodoItemDao extends BaseDao<TodoItem> {


  List<TodoItem> findAllAvailable();

  List<TodoItem> findExpiredAndInCompleted();



}
