package se.me0nly.dao.impl.sequencer;

public class TodoItemIdSequencer {

  private static int sequencer = 10000;

  public static int nextId() {
    return ++sequencer;
  }
}
