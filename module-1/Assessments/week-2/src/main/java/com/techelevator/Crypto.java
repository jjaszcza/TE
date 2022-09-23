package com.techelevator;

import java.util.HashMap;
import java.util.Map;

/**
 * Crypto encrypts strings using a substitution cypher. In a substitution
 * cypher, every letter is replaced with a different letter.
 *
 * For this exercise, use the following substitution cypher:
 *
 *   Letter -> Encrypts To
 *     A    ->    N
 *     B    ->    J
 *     C    ->    F
 *     D    ->    Q
 *     E    ->    A
 *     F    ->    P
 *     G    ->    S
 *     H    ->    R
 *     I    ->    X
 *     J    ->    G
 *     K    ->    D
 *     L    ->    O
 *     M    ->    T
 *     N    ->    E
 *     O    ->    U
 *     P    ->    H
 *     Q    ->    M
 *     R    ->    V
 *     S    ->    B
 *     T    ->    C
 *     U    ->    W
 *     V    ->    K
 *     W    ->    Z
 *     X    ->    I
 *     Y    ->    L
 *     Z    ->    Y
 */
public class Crypto {






    /**
     * Encrypts and returns "strToEncrypt" using the substitution cypher above
     *
     * @param strToEncrypt The String to encrypt
     * @return The encrypted String
     */
  public String encrypt(String strToEncrypt) {

      Map<String, String> characters = new HashMap<>();

      characters.put("A", "N");
      characters.put("B", "J");
      characters.put("C", "F");
      characters.put("D", "Q");
      characters.put("E", "A");
      characters.put("F", "P");
      characters.put("G", "S");
      characters.put("H", "R");
      characters.put("I", "X");
      characters.put("J", "G");
      characters.put("K", "D");
      characters.put("L", "O");
      characters.put("M", "T");
      characters.put("N", "E");
      characters.put("O", "U");
      characters.put("P", "H");
      characters.put("Q", "M");
      characters.put("R", "V");
      characters.put("S", "B");
      characters.put("T", "C");
      characters.put("U", "W");
      characters.put("V", "K");
      characters.put("W", "Z");
      characters.put("X", "I");
      characters.put("Y", "L");
      characters.put("Z", "Y");

      if(characters.containsKey(strToEncrypt.toUpperCase())) {
          return characters.get(strToEncrypt.toUpperCase());
      }

        return strToEncrypt;
    }

    /**
     * Decrypts and returns "strToDecrypt" using the cypher above
     *
     * @param strToDecrypt The String to decrypt
     * @return The decrypted String
     */
    public String decrypt(String strToDecrypt) {
        return null;
    }
}
