package org.sber.intership;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String filePath = "Задача ВС Java Сбер.csv";


    public static void main(String[] args) {
        if (args.length > 0) {
            filePath = args[0];
        } else {
            System.out.println("No command-line arguments provided.");
        }
        FileHandler filehandler = new FileHandler(
                new File(filePath),
                Charset.forName("Windows-1251"));
        ArrayList<City> cities = filehandler.readCities();
        for (City city : cities){
            System.out.println(city);
        }

    }
}