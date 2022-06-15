package Lesson_5;

import java.io.*;

public class TrainingInputOutputApp {

    public static void main(String[] args) throws IOException {

        // Create a new file
        File fileCSV = new File("data_5.csv");

        String headerOrig = "Value1"+ ";" + "Value2" + ";" + "Value3" + ";" + "\n";
        int[][] dataOrig = { {1, 200, 300},
                {2, 222, 333} };

//        1) записываем headerOrig и dataOrig
//        через FileWriter в data_5.csv
//        dataOrig преобразовываем в строку
        try (FileWriter writer = new FileWriter(fileCSV, true)) {
            writer.write(headerOrig);
            for (int[] ints : dataOrig) {
                for (int j = 0; j < dataOrig.length; j++) {
                    writer.write(ints[j] + ";");
                }
            }
        }




    }
}
