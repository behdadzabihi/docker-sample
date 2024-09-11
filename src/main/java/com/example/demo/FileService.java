package com.example.demo;


import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;

@Service
public class FileService {

    private static final String FILE_PATH = "/app/data/application.log";

    public void logMessage(String message) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}