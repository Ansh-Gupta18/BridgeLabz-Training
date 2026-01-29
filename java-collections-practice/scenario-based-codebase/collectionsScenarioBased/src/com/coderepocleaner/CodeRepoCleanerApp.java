package com.coderepocleaner;

//package com.coderepocleaner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class CodeRepoCleanerApp {

    public static void main(String[] args) throws IOException {

        // ✅ Use project-relative folder OR existing absolute path
        String rootDir = "D:\\LeetCode";   // make sure this folder exists
        // OR (recommended)
        // String rootDir = "LeetCode";

        File root = new File(rootDir);

        // ✅ SAFETY CHECK (IMPORTANT)
        if (!root.exists() || !root.isDirectory()) {
            System.out.println(" Directory not found: " + rootDir);
            return;
        }

        // Scan Java files
        List<Path> javaFiles = JavaFileScanner.scanJavaFiles(rootDir);

        System.out.println("Total Java files found: " + javaFiles.size());

        // Example stream usage
        System.out.println("\nFiles larger than 5 KB:");
        javaFiles.stream()
                .map(Path::toFile)
                .filter(f -> f.length() > 5 * 1024)
                .forEach(f -> System.out.println(f.getAbsolutePath()));
    }
}
