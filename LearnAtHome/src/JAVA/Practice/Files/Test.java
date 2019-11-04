package JAVA.Practice.Files;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        {
            String data = "9/23/2006 8:55:26 AM - kyle (10.0.2.143)>  REST STREAM";
            ////
            Pattern ip = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
            Pattern date = Pattern.compile("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}");
            Pattern info = Pattern.compile("> .*");
            Pattern time = Pattern.compile("(([0-2][0-4])|[0-9]):[0-5][0-9]:[0-5][0-9] AM|PM");
            Pattern user = Pattern.compile("- [A-Za-z0-9]* ");
            Pattern day = Pattern.compile("/[0-9]{1,2}/");
            Pattern month = Pattern.compile("[0-9]{1,2}/");
            Pattern year = Pattern.compile("/[0-9]{4}");
            ////
            Matcher matcher = day.matcher(data);
            System.out.println(matcher.find() ? matcher.group(0).substring(1,3): null);
            //
            matcher = month.matcher(data);
            System.out.println(matcher.find() ? matcher.group(0).substring(0,matcher.group(0).length() - 1): null);
            //
            matcher = year.matcher(data);
            System.out.println(matcher.find() ? matcher.group(0).substring(1): null);
            //
            String s = "2.11.1998";
            System.out.println(s.substring(0,s.length()-8));


        }
    }
}
