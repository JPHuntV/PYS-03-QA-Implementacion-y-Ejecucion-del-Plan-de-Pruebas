import org.apache.tools.ant.types.resources.FileResource;
import java.io.File;

public class CompareResourcePerformanceTest {
    public static void main(String[] args) {

        File[] testFiles = {
                new File("small_file1.txt"),
                new File("small_file2.txt"),
                new File("large_file1.txt"),
                new File("large_file2.txt"),
                new File("testfile1.csv"),
                new File("testfile2.csv"),
                new File("testfile1.json"),
                new File("testfile2.json"),
                new File("file_with_@_special#_chars.txt"),
                new File("another_file_@_special#.txt")
        };
        // Comparacion de todos los archivos
        for (int i = 0; i < testFiles.length; i++) {
            for (int j = i + 1; j < testFiles.length; j++) {
                compareFiles(testFiles[i], testFiles[j]);
            }
        }
    }

    private static void compareFiles(File file1, File file2) {
        FileResource resource1 = new FileResource(file1);
        FileResource resource2 = new FileResource(file2);
        // Medicion del tiempo antes de la comparacion
        long startTime = System.nanoTime();
        // Comparacion de los recursos
        int result = resource1.compareTo(resource2);
        // Medicion del tiempo despues de la comparacion
        long endTime = System.nanoTime();
        // resultados
        System.out.println("Comparing " + file1.getName() + " with " + file2.getName());
        System.out.println("Result: " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        System.out.println("----------------------------------------------------");
    }
}
