package org.jrm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class model for a FileInput (read)
 * @author mgreen14
 * @version 1.0
 */
public class FileInput {

    private BufferedReader in = null;
    private String fileName;

    /**
     * Constructor for FileInput class. Takes a file name will throw exception if file does not exist or is unreadable.
     * @param fileName String representation of a full path to a readable file
     */
    public FileInput(String fileName) {
        this.fileName = fileName;
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
    }

    /**
     * Dump contents of file to sysout
     */
    public void fileRead() {
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
        }
    }

    /**
     * read and return line of file
     * @return String representation of "the next line" in a file
     */
    public String fileReadLine() {
        try {
            String line = in.readLine();
            return line;
        } catch (Exception e) {
            System.out.println("File Read Error: " + fileName + " " + e);
            return null;
        }
    }

    /**
     * Close file that is opened by constructor
     */
    public void fileClose() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}