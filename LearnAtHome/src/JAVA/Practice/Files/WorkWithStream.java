package JAVA.Practice.Files;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class WorkWithStream {
    public static void main(String[] args) {
        streamSymbols();
    }

    public static void scanner() {
        //Scanner
        //Creating
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input symbol :");
        value = scanner.next().charAt(0);
        System.out.println("You inputted symbol : " + value);
        System.out.println("Code of symbol : " + (char) value);
    }

    public static void streamOneSymbol() {
        //InputStream
        //Creating
        InputStream inputStream = System.in;
        int value;
        System.out.println("Input symbol :");
        //
        try {
            value = inputStream.read();
            System.out.println("You inputted symbol : " + (char) value);
            System.out.println("Code of symbol : " + value);
        } catch (IOException e) {
            System.out.println("Error!!!");
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void streamSymbols() {
        //
        InputStream inputStream = System.in;
            //
            try {
                int codeOfsymb;
                while ((codeOfsymb = inputStream.read()) != 13){
                    System.out.println((char) codeOfsymb + " - " + codeOfsymb);
                }
            } catch (IOException e){
                e.printStackTrace();
            }
    }
}
