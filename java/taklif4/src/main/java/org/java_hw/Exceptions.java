package org.java_hw;

import java.io.*;

public class Exceptions {

    public static void main(String[] args) throws FileUtilsException {

        try {
            File file = new File("filename.txt");
            FileInputStream fos = new FileInputStream(file);

        }catch (Exception e) {
            throw new FileUtilsException("Can not read file", e);
        }
    }
}

