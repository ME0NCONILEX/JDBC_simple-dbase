package se.me0nly.model;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String _description;
    public LocalDate deadLine;
    public boolean done;
    public  Person assignee;

    public TodoItem(String title, String _description, LocalDate deadLine) {
        this.id = id;
        this.title = title;
        this._description = _description;
        this.deadLine = deadLine;
        this.done = done;
        this.assignee = assignee;
    }

    public TodoItem(String title, String _description) {
        this.title = title;
        this._description = _description;
    }

    public TodoItem(int id, String title, String _description) {
        this.id = id;
        this.title = title;
        this._description = _description;
    }

    public TodoItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String get_description() {
        return _description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public void set_description(String _description) {
        this._description = _description;
    }


    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", _description='" + _description + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", assignee=" + assignee +
                '}';
    }
}
