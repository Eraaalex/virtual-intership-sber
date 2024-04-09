package org.sber.intership;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandler {
    Scanner reader;

    FileHandler(File file, Charset charset)  {
        try {
            reader = new Scanner(file, charset);
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }

    ArrayList<City> readCities() {
        ArrayList<City> cities = new ArrayList<>();
        try{
            while (reader.hasNextLine()) {
                String[] parameters = reader.nextLine().split(";");
                if (parameters.length == 6) {
                    cities.add(new City(
                                    parameters[1],
                                    parameters[2],
                                    parameters[3],
                                    Integer.parseInt(parameters[4]),
                                    parameters[5]
                            )
                    );
                }
            }
        } catch (NumberFormatException | NullPointerException exception ){
            System.out.println(exception.getMessage());
        }

        return cities;
    }

}
