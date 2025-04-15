package com.altair.Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("C:\\Users\\chand\\OneDrive\\Desktop\\altair.txt");

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());

                FileWriter writer = new FileWriter(myFile);
                writer.write("AltairTechnologies");
                writer.close();
                System.out.println("Successfully wrote to the file.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
