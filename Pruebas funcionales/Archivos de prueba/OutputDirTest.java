// File: src/com/example/OutputDirTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class OutputDirTest {

    @Test
    public void testOutputDirectory() {
        String outputDirPath = System.getProperty("ant.junit.output.dir");
        if (outputDirPath == null) {
            outputDirPath = "C:/Users/Bayro/Downloads/hola/output"; // Default value
        }
        System.out.println("Output Directory Path: " + outputDirPath); // Línea de depuración
        File outputDir = new File(outputDirPath);
        
        // Verificar si el directorio existe
        if (!outputDir.exists()) {
            fail("Output directory does not exist: " + outputDirPath);
        }
        
        assertTrue(outputDir.isDirectory(), "Output path should be a directory");
    }
}

