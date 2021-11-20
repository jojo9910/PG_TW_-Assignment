package com.company;

public class Holiday {
    private String holidayName;
    private int holidayDate;
    private String holidayMonth;
    public Holiday(String holidayName, int holidayDate, String holidayMonth) {
        this.holidayName = holidayName;
        this.holidayDate = holidayDate;
        this.holidayMonth = holidayMonth;
    }

    public void SetHolidayName(String holidayName){this.holidayName=holidayName;}
    public void SetHolidayDay(int holidayDate){
        this.holidayDate=holidayDate;
    }
    public void SetHolidayMonth(String holidayMonth){
        this.holidayMonth=holidayMonth;
    }

    public String GetHolidayName(){return this.holidayName;}
    public int GetHolidayDay(){return this.holidayDate;}
    public String GetHolidayMonth(){return this.holidayMonth;}

    public boolean IsSameMonth(Holiday other) {
        return this.holidayMonth.equals(other.holidayMonth);
    }
    public static double avgDate(Holiday[] arr) {
        double avg = 0;
        for(Holiday holiday : arr) {
            avg += holiday.holidayDate;
        }
        return avg / arr.length;
    }
}
