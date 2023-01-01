package se.me0nly.dao.impl.sequencer;

public class PersonIdSequencer {

  private static int sequencer = 1000;

  public static int nextId() {
    return ++sequencer;
  }
}
