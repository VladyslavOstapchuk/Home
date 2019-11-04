package Basics.Lab29;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //File
        String path = "log.txt";
        File file = new File(path);
        //
        System.out.println("Count of lines in file : " + (countFileLines(file) - 1));
        //1//
        System.out.println("Ex1////");
        ////
        String[][] log = readFileToArray(file, 100);
        for (int i = 0; i < log.length; i++) {
            System.out.println("ip: " + log[i][0] +
                    "; date: " + log[i][1] +
                    "; message: " + log[i][2] + " ;");
        }

        //2//

        System.out.println("Ex2////");
        ////
        System.out.println(new LogInfo(23, 6, 2006, "8:49:09 AM", "kyle", "10.0.2.143", "SYST"));

        //3//
        System.out.println("Ex3////");
        ////
        LogInfo[] logInfos = createLogArray(file,50);
        for(LogInfo l: logInfos) System.out.println(l);

    }

    //1
    public static String[][] readFileToArray(File file, int countOfRecords) {
        String[][] log = new String[countOfRecords][3];
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            //
            Pattern ip = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
            Pattern date = Pattern.compile("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}");
            Pattern info = Pattern.compile("> .*");
            //
            Matcher matcher;
            //
            for (int i = 0; i < log.length; i++) {
                matcher = ip.matcher(scanner.nextLine());
                log[i][0] = matcher.find() ? matcher.group(0) : null;
                matcher = date.matcher(scanner.nextLine());
                log[i][1] = matcher.find() ? matcher.group(0) : null;
                matcher = info.matcher(scanner.nextLine());
                log[i][2] = matcher.find() ? matcher.group(0) : null;
            }
        } catch (FileNotFoundException f) {
            System.out.println("FILE DOES NOT EXIST");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return log;
    }

    //2
    public static LogInfo[] createLogArray(File file, int countOfRecords) {
        LogInfo[] logInfos = new LogInfo[countOfRecords];
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            //
            Pattern ip = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
            Pattern day = Pattern.compile("/[0-9]{1,2}/");
            Pattern month = Pattern.compile(" [0-9]{1,2}/");
            Pattern year = Pattern.compile("/[0-9]{4} ");
            Pattern info = Pattern.compile("> .*");
            Pattern time = Pattern.compile("(([0-2][0-4])|[0-9]):[0-5][0-9]:[0-5][0-9] AM|PM");
            Pattern user = Pattern.compile("- [A-Za-z0-9]* ");
            //
            int dayL, monthL, yearL;
            String hour;
            String userName;
            String ipNum;
            String message;
            for (int i = 0; i < logInfos.length; i++) {
                Matcher matcher;
                //
                matcher = ip.matcher(scanner.nextLine());
                ipNum = (matcher.find() ? matcher.group(0) : null);
                //
                matcher = info.matcher(scanner.nextLine());
                message = (matcher.find() ? matcher.group(0).substring(2) : null);
                //
                matcher = time.matcher(scanner.nextLine());
                hour = (matcher.find() ? matcher.group(0) : null);
                //
                matcher = user.matcher(scanner.nextLine());
                userName = (matcher.find() ? matcher.group(0).substring(2) : "not logged in");
                //
                matcher = day.matcher(scanner.nextLine());
                dayL = (matcher.find() ? Integer.parseInt(matcher.group(0).substring(1,3).trim()): null);
                //
                matcher = month.matcher(scanner.nextLine());
                monthL = (matcher.find() ? Integer.parseInt(matcher.group(0).substring(0,matcher.group(0).length() - 1).trim()) : null);
                //
                matcher = year.matcher(scanner.nextLine());
                yearL = (matcher.find() ? Integer.parseInt(matcher.group(0).substring(1).trim()) : null);
                //
                logInfos[i] = new LogInfo(dayL,monthL,yearL,hour,userName,ipNum,message);
            }
            //
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return logInfos;
    }

    //
    public static int countFileLines(File file){
        int count = 0;
        FileReader fileReader = null;
        LineNumberReader lineNumberReader = null;
        try{
            fileReader = new FileReader(file);
            lineNumberReader = new LineNumberReader(fileReader);
            //
            while (lineNumberReader.readLine() != null){
                count++;
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                lineNumberReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return count;
    }
}