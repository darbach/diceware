package edu.cnm.deepdive.diceware.service;

public interface PassphraseGenerator {

  /**
   * Get some words that can be combined into a passphrase.
   * @param length Number of words you need.
   * @return An array of words.
   */
  String[] generate(int length);

}
