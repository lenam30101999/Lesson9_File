package com.k003.nam;

import java.io.*;

public class Main {
    private static final String fileName = "/home/nam/Code/lesson9/src/com/k003/nam/test.txt";
    public static void main(String[] args) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (line != null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
    }
}
