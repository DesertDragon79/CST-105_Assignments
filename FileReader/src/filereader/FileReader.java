/*
 Created by Michael Kibler
Last edit 7-15-2017
 */
package filereader;

import java.io.*;
import java.util.*;

public class FileReader {

    public static void main(String[] args) {

        java.io.File file = new java.io.File("Cst105Test.txt");
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String num = input.nextLine().toUpperCase();
                System.out.println(num);
            }
        } catch (FileNotFoundException e) {
            System.err.format("File not found.", args);
        }
    }

}
