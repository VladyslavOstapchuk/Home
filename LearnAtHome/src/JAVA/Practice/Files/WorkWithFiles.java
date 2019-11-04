package JAVA.Practice.Files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WorkWithFiles {
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //For symbols we use symbol streams like InputStreamReader InputStreamWriter
    //We can set path in 4 ways:
    //1."name.txt"
    //2."src/name.txt"
    //3."D:/name.txt"
    //4.Object of class File
    //Execution
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //Creating file
        String name = "Test";
        String fileName = name + ".txt";
        File file = new File(fileName);
        //Input data
        String data = inputData();
        //
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //Input data
    public static String inputData() {
        //
        System.out.println("DATA: ");
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = null;
        try {
            //
            inputStream = System.in;
            int codeOfsymb;
            //
            while ((codeOfsymb = inputStream.read()) != 13) {
                stringBuilder.append((char) codeOfsymb);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return stringBuilder.toString();
    }

    //Check if file exists
    public static void checkFile(File file) {
        File checkFile = new File(file.getPath());
        if (!checkFile.exists()) {
            try {
                checkFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //Saving
    //FileWriter
    public static void saveFileViaWriter(File file, String data) {
        //
        checkFile(file);
        //
        FileWriter fileWriter = null;
        try {//Creating
            fileWriter = new FileWriter(file);
            //Write info into stack
            fileWriter.write(data);
            //Save stack
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing stream
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //
        System.out.println("DATA HAS BEEN SAVED");
    }

    //File
    //Byte stream
    public static void saveFileViaStream(File file, String data) {
        //
        checkFile(file);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //
        System.out.println("DATA HAS BEEN SAVED");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //Reading
    //FileReader
    public static void readFileViaReader(File file) {
        //Creating
        FileReader fileReader = null;
        try {

            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            //Place where data is saving
            StringBuilder stringBuilder = new StringBuilder();
            //Saving all from file to buffer
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
            //Show data from buffer
            System.out.println(stringBuilder.toString());

        } catch (FileNotFoundException f) {
            System.out.println("FILE DOES NOT FOUND");
        } finally {
            try {
                //
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //
        System.out.println("DATA HAS BEEN READ");

    }

    //File
    //Byte stream
    public static void readFileViaStream(File file) {
        InputStreamReader inputStreamReader = null;
        FileInputStream fileInputStream = null;
        try {
            //Creating
            fileInputStream = new FileInputStream(file);
            //Creating object of child class of InputStream for using coding system
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            int symb;
            //
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
        System.out.println("DATA HAS BEEN READ");
    }

    //Byte stream
    //It works if text is written in English
    public static void readViaStreamByArray(File file) {
        FileInputStream fileInputStream = null;
        try {

            fileInputStream = new FileInputStream(file);

            int length = fileInputStream.available();
            byte[] data = new byte[length];
            fileInputStream.read(data);

            String result  = new String(data);


            for(byte bytes : data){
                System.out.print((char)bytes);
            }

        } catch (FileNotFoundException e) {
            System.out.println("FILE DOES NOT EXIST");
        } catch (IOException e) {
            System.out.println("IO ERROR");
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    //Delete
    //Create
    //Append
    //


}
