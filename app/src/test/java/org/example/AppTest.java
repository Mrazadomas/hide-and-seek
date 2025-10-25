package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
  @Test
  void theTestsWork() {
    assertEquals(true, true);
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyListGenerator generator2 = new FuzzyListGenerator(1);
    FuzzyFinder finder = new FuzzyFinder();
 
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
    ArrayList<Fuzzy> sortedFuzzies2 = generator2.sortedRainbowFuzzies();
    
 
    int testOne = finder.linearSearch(sortedFuzzies);
    int testTwo = finder.binarySearch(0, sortedFuzzies.size(), sortedFuzzies);
    int testThree = finder.linearSearch(randomFuzzies);
    int testFour = finder.binarySearch(0,randomFuzzies.size(), randomFuzzies);
    int testFive = finder.linearSearch(sortedFuzzies2);
    assertEquals(testOne, 1000);
    assertEquals(testTwo, 1000);
    assertEquals(testFour, -1);
  }
}
