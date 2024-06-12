package org.kramer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsTests {
  @Test
  void givenOne_shouldReturnEmptyList() {
    assertEquals(List.of(), PrimeFactors.of(1));
  }

  @Test
  void givenNumberW_shouldReturnListOfAllPrimeFactors() {
    assertPrimeFactors(2, List.of(2));
    assertPrimeFactors(3, List.of(3));
    assertPrimeFactors(4, List.of(2, 2));
    assertPrimeFactors(5, List.of(5));
    assertPrimeFactors(6, List.of(2, 3));
    assertPrimeFactors(7, List.of(7));
    assertPrimeFactors(8, List.of(2, 2, 2));
    assertPrimeFactors(9, List.of(3, 3));
    assertPrimeFactors(2*3*3*5*7*11*11*13*17, List.of(2, 3, 3, 5, 7, 11, 11, 13, 17));
  }

  private static void assertPrimeFactors(int n, List<Integer> expectedPrimeFactors) {
    assertEquals(expectedPrimeFactors, PrimeFactors.of(n));
  }
}