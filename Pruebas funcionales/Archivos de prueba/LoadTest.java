package com.example;

import org.junit.jupiter.api.Test;

class LoadTest {

    @Test
    void testUnderLoad() {
        for (int i = 0; i < 1000; i++) {
            // Simula operaciones intensivas
            System.out.println("Operación " + i);
        }
    }
}
