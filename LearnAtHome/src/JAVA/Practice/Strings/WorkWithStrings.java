package JAVA.Practice.Strings;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithStrings {
    public static void main(String[] args) {
        regex();
    }

    //Simple string operation
    public static void simpleStrings(){
        String text = "Ala ma kota";

        //Returns length of text
        text.length();

        //Concat
        text.concat(""); // = text + ""

        //Replace symbols
        text.replace('a', 'b');

        //Substring
        text.substring(0,3);


    }

    //RegEx
    public static void regex() {
        //Find one or more symbols
        String reg1 = "[a-zA-Z0-9]+";
        //Find in the beginning of the text
        String reg2 = "^[a-zA-Z0-9]";
        //Find in the end of the text
        String reg3 = "[a-zA-Z0-9]$";
        //If string has one of this symbols true
        String reg4 = ".[a-zA-Z0-9]";
        String reg5 = "[a-zA-Z0-9]";
        //Find digit; \\d = [0-9]
        String reg6 = "[\\d]";
        //Find space
        String reg7 = "[\\s]";
        //"\\d\\s" = <some digits> + " "
        //Find not digit symbol; D\\ = [^0-9]
        String reg8 = "[\\D]";
        //Find string without spaces
        String reg9 = "[\\S]";

        String text = "Ala has a cat 123123";
        //
        Pattern patter = Pattern.compile(reg1);
        Matcher matcher = patter.matcher(text);
        //
        System.out.println(matcher.find());
    }

    //Simple tokenizer
    public static void usingSplit(){
        String text = "Ala ma kota";

        //.split("delimiter") returns array of lines

        String[] lines = text.split(" ");

        System.out.println("////Split");
        for(String line : lines ) System.out.println(line);

    }

    //String tokenizer
    public static void tockens() {
        //13 - code of \n
        String line = "T e s t : s t r i n g";
        StringTokenizer stringTokenizer = new StringTokenizer(line, " :", false);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());

        }
    }
}
