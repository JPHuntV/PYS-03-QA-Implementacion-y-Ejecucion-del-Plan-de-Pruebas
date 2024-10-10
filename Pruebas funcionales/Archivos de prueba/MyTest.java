package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTest {
    private static int globalCounter;
    private int instanceCounter;

    @BeforeAll
    public static void initAll() {
        // Código que se ejecuta una vez antes de todas las pruebas
        globalCounter = 0;
    }

    @BeforeEach
    public void init() {
        // Código que se ejecuta antes de cada prueba
        instanceCounter = 0;
    }

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
        globalCounter++;
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result, "5 - 3 should equal 2");
        instanceCounter++;
    }

    @AfterAll
    public static void tearDownAll() {
        // Código que se ejecuta una vez después de todas las pruebas
        System.out.println("Global counter: " + globalCounter);
    }
}