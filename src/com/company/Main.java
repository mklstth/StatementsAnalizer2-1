package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    static String rout = "input/in.csv";
    public static void main(String[] args) throws IOException {

        Path path = Paths.get(rout);
        List<String> list = Files.readAllLines(path);

        int sum = 0;

        for(String line : list){
            String[] column = line.split(",");
            sum += Integer.parseInt(column[1]);
        }
	    System.out.println(sum);
    }
}
