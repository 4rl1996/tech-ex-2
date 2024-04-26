package leapYear;

public class LeapYearProcessor {

    public Boolean isLeapYear(int year) {
        return year % 400 == 0 ||
                (year % 4 == 0  && year % 100 != 0);
    }
}
