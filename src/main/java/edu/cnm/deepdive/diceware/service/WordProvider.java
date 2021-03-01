package edu.cnm.deepdive.diceware.service;

import java.util.Collection;

public interface WordProvider {

  /**
   * Get whatever words are in the collection.
   * @return A collection of words.
   */
  Collection<String> words();

}
