package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    @Test
    void testComponentInteraction() {
        // Simula la interacción entre componentes
        ComponentA a = new ComponentA();
        ComponentB b = new ComponentB();

        String result = a.communicateWith(b);
        assertEquals("Success", result);
    }

    // Clases simuladas para propósitos de la prueba
    public class ComponentA {
        String communicateWith(ComponentB b) {
            return b.respond();
        }
    }

    public class ComponentB {
        String respond() {
            return "Success";
        }
    }
}
