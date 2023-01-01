package se.me0nly.model;

import se.me0nly.work.AppInsP;

import javax.sql.RowSet;
import java.time.LocalDate;

public class Person {
    private int id;
    private String first_name;
    private  String last_name;
    private  String email;
    private LocalDate regDate;
    private boolean active;

    public Person(int id, String first_name, String last_name, String email, LocalDate regDate, boolean active) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
//        this.email = email;
//        this.regDate = regDate;
//        this.active = active;
    }

    public Person(int id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Person(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
 //       this.email = email;
    }

    public Person(String first_name, String last_name, boolean active) {
        this.first_name = first_name;
        this.last_name = last_name;
//        this.active = active;
    }

    public Person(String fn, String ln, AppInsP appUserData) {

    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
//                ", email='" + email + '\'' +
//                ", regDate=" + regDate +
//                ", active=" + active +
                '}';
    }

    public RowSet getAppUser() {
        return null;
    }
}
