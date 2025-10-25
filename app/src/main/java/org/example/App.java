package org.example;

import java.util.ArrayList;

public class App {


  public static void main(String[] args) {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyListGenerator generator2 = new FuzzyListGenerator(2);
    FuzzyFinder finder = new FuzzyFinder();
 
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
    ArrayList<Fuzzy> sortedFuzzies2 = generator2.sortedRainbowFuzzies();
    
 
    int testOne = finder.linearSearch(sortedFuzzies);
    int testTwo = finder.binarySearch(0, sortedFuzzies.size(), sortedFuzzies);
    int testThree = finder.linearSearch(randomFuzzies);
    int testFour = finder.binarySearch(0,randomFuzzies.size(), randomFuzzies);
    int testFive = finder.linearSearch(sortedFuzzies2);

    System.out.println(testOne);
    System.out.println(testTwo);
    System.out.println(testThree);
    System.out.println(testFour);
    System.out.println(testFive);
  }
}
