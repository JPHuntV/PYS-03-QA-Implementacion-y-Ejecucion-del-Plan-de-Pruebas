package com.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.Files;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilePermissionsTest {

    @Test
    void testFilePermissions() throws IOException {
        File tempFile = Files.createTempFile("testFile", ".txt").toFile();
        tempFile.setReadable(true);
        tempFile.setWritable(true);

        // Verificar permisos de archivo
        assertTrue(tempFile.canRead());
        assertTrue(tempFile.canWrite());

        // Modificar permisos a solo lectura
        tempFile.setWritable(false);

        // Verificar que los permisos fueron cambiados correctamente
        assertTrue(tempFile.canRead());
        assertFalse(tempFile.canWrite());
    }
}