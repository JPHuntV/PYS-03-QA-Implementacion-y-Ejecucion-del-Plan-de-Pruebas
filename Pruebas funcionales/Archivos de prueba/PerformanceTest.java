package com.example;

import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    void testPerformance() {
        long startTime = System.nanoTime();
        
        // Aquí va el código cuya performance deseas medir
        for (int i = 0; i < 1000; i++) {
            String result = "test:" + i;
            System.out.println(result);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Tiempo de ejecución: " + duration + " nanosegundos");
    }
}
