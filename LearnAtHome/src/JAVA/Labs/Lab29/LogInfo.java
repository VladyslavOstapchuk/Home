package Basics.Lab29;

public class LogInfo {
    //
    private int day, month, year;
    private String hour;
    private String user;
    private String ip;
    private String text;

    //
    public LogInfo(int day, int month, int year, String hour, String user, String ip, String text) {
        setDay(day);
        setMonth(month);
        setYear(year);
        setHour(hour);
        setUser(user);
        setIp(ip);
        setText(text);
    }

    //
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //
    @Override
    public String toString() {
        return "LogInfo{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour='" + hour + '\'' +
                ", user='" + user + '\'' +
                ", ip='" + ip + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}