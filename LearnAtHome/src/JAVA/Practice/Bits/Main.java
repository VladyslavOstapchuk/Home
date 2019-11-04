package Basics.Bits;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(createRandomColor());
        //2
        //2.1
        File file = new File("infoAboutColors.txt");
        saveInfoAboutColors(createRandomColors(10000), file);
        //2.2
        file = new File("infoAboutColor.txt");
        saveInfoAboutColor(createRandomColor(),file);
        //3

    }

    //
    public static String[] returnInfoAboutColor(Color[] colors) {
        String info[] = new String[colors.length];
        for (int i = 0; i < info.length; i++) {
            info[i] = colors[i].toString();
        }
        //
        return info;
    }

    //
    public static void saveInfoAboutColor(Color color, File file) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(color.toString());
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //
    public static void saveInfoAboutColors(Color[] colors, File file) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            //
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < colors.length; i++) {
                stringBuilder.append(colors[i].toString() + "\n");
            }
            //
            fileWriter.write(stringBuilder.toString());
            fileWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //
    public static Color[] createRandomColors(int count) {
        Color[] colors = new Color[count];
        //
        for (int i = 0; i < colors.length; i++) {
            colors[i] = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        }
        return colors;
    }

    //
    public static Color createRandomColor() {
        return new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

    //
    public static String readByteInfoFromFile() {
        return "";
    }

    //
    public static String readStringInfoFromFile(File file) {
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            StringBuilder stringBuilder = new StringBuilder();
            //
            while (scanner.hasNextLine()){
                stringBuilder.append(scanner.nextLine());
            }
        } catch (FileNotFoundException f){
            f.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }




        return "";
    }
}
