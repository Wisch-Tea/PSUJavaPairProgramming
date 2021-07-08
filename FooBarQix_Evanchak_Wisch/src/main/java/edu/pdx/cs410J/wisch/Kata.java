package edu.pdx.cs410J.wisch;

import static java.lang.Float.NaN;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    String arg;
    for (String s : args) {
      arg = s;
      if (!checkIsNum(arg)) {
        System.out.println("NaN => NaN");
      } else {
        System.out.println(arg + " => ");
      }
    }
    System.exit(1);
  }

  private static boolean checkIsNum(String argument) {
    int num = Integer.parseInt(argument);
    if (Float.isNaN(num)) {
      return false;
    }
    printNumFooQix(num);
    return true;
  }

  /**
   * Checks number variable via modulus;
   */
  private static void printNumFooQix(int number) {
    StringBuilder stringOut = new StringBuilder();
    // Divisibility checks.
    if (number % 3 == 0) {
      stringOut.append("Foo");
    } if (number % 5 == 0) {
      stringOut.append("Bar");
    } if (number % 7 == 0) {
      stringOut.append("Qix");
    }
    // Contains checks.
    if (Integer.toString(number).contains("3")) {
      stringOut.append("Foo");
    } if (Integer.toString(number).contains("5")) {
      stringOut.append("Bar");
    } if (Integer.toString(number).contains("7")) {
      stringOut.append("Qix");
    }

    if (stringOut.length() == 0) {
      System.out.println(number);
    } else {
      System.out.println(stringOut);
    }
  }
}