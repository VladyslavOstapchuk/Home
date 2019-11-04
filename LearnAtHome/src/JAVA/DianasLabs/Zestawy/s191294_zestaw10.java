package DianasLabs.Zestawy;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class s191294_zestaw10 {

    public static void main(String[] args) {
        czwiczenie02();
        czwiczenie03();
        czwiczenie04();
    }

    public static void czwiczenie02() {
        System.out.println("\nCZW02");

        File file = new File("s19294_zestaw03.java");

        System.out.println("\nPRZEZ FILEREADER: ");
        readFileViaStream(file);
        System.out.println("\n\n\nPRZEZ INPUTSTREAM : ");
        readFileViaReader(file);
    }

    public static void czwiczenie03() {
        System.out.println("\nCZW03\n");


        StringBuilder stringBuilder = readFileViaReaderToStrinBuilder(new File("Wiki.txt"));
        System.out.println(stringBuilder.toString());
    }

    public static void czwiczenie04() {
        System.out.println("\nCZW4\n");

        //Read from a file
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("Wiki.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StreamTokenizer filetokenizer = new StreamTokenizer(fileReader);
        for(int i = 1; i <= 200; i++){
            System.out.print(i + " : ");
            try {
                if (!(filetokenizer.nextToken()!=StreamTokenizer.TT_EOF)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(filetokenizer.ttype==StreamTokenizer.TT_NUMBER){
                System.out.println(filetokenizer.nval);
            }else if(filetokenizer.ttype==StreamTokenizer.TT_WORD){
                System.out.println(filetokenizer.sval);
            }
        }
    }

    public static StringBuilder readFileViaReaderToStrinBuilder(File file){
        FileReader fileReader = null;

        try {

            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            StringBuilder stringBuilder = new StringBuilder();

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
            return stringBuilder;

        } catch (FileNotFoundException f) {
            System.out.println("Taki plik nie istnije");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public static void readFileViaReader(File file) {
        FileReader fileReader = null;

        try {

            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            StringBuilder stringBuilder = new StringBuilder();

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
            System.out.println(stringBuilder.toString());

        } catch (FileNotFoundException f) {
            System.out.println("Taki plik nie istnije");
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void readFileViaStream(File file) {
        InputStreamReader inputStreamReader = null;
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            int symb;
            while ((symb = inputStreamReader.read()) != -1) {
                System.out.print((char) symb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
