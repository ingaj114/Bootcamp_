package com.company.day4;

import java.io.*;

public class InputOutput {
    public static void main(String[] args){
        //1. Write a Java program to get a list of all file/directory names from the given.
        /*File file = new File("C:/Users/Inga/Documents/desktop");
        String[] files = file.list();
        for (String name : files) {
            System.out.println(name);
        }*/
        //2. Write a Java program to get specific files by extensions from a specified folder.
        /*File file = new File("C:/Users/Inga/Documents/desktop");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".jpg")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        for (String name : list) {
            System.out.println(name);
        }*/
        //3. Write a Java program to check if a file or directory specified by pathname exists or not.
        /*File file = new File("C:/Users/Inga/Documents/desktop/IMG_1229.png");
        if (file.exists()) {
            System.out.println("The directory of file exists");
        } else {
            System.out.println("Directory of file doesn't exist");
        }*/
        //4. Write a Java program to check if a file or directory has read and write permission.
        /*File file = new File("C:/Users/Inga/Documents/desktop/IMG_1229.png");
        if (file.canWrite()) {
            System.out.println(file.getAbsolutePath() + " can write");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot write");
        }
        if (file.canRead()) {
            System.out.println(file.getAbsolutePath() + " can read");
        } else {
            System.out.println(file.getAbsolutePath() + " cannot read");
        }*/
        //5. Write a Java program to check if given pathname is a directory or a file.
        /*File file = new File("C:/Users/Inga/Documents/desktop");
        if (file.isDirectory()) {
            System.out.println(file.getAbsolutePath() + " is a directory");
        } else {
            System.out.println(file.getAbsolutePath() + " is not a directory");
        }
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + " is a file");
        } else {
            System.out.println(file.getAbsolutePath() + " is not a file");
        }*/
        //6. Write a Java program to compare two files lexicographically. Go to the editor
        /*String str = "Hello World!";
        String str2 = "Hello World!";
        String str3 = "Good World!";

        int option1 = str.compareTo(str2);
        System.out.println(option1);
        int option2 = str2.compareTo(str3);
        System.out.println(option2);*/
        // 7. Write a Java program to get last modified time of a file.
        /*File file = new File("C:/Users/Inga/Documents/desktop/IMG_1229.png");
        Date date = new Date(file.lastModified());
        System.out.println("The file last modified on: " + date);*/
        //8. Write Java program to read input from java console.
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = reader.readLine();
        System.out.print("Your name is: " + name);*/

        //9. Write a Java program to get file size in bytes, kb, mb.

        //10. Write a Java program to read contents from a file into byte array.

    }
}
