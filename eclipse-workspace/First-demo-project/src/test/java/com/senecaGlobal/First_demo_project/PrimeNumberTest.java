package com.senecaGlobal.First_demo_project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PrimeNumberTest {

    @Mock
    private PrimeNumberChecker primeNumberChecker;

    @Test
    public void testIsPrimeWithPrimeNumber() {
        int number = 7;
        when(PrimeNumberChecker.isPrime(number)).thenReturn(true);
        assertTrue(PrimeNumberChecker.isPrime(number));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        int number = 6;
        when(PrimeNumberChecker.isPrime(number)).thenReturn(false);
        assertFalse(PrimeNumberChecker.isPrime(number));
    }
}
}
