package com.onpy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Flight {
    String direction;
    String numberFlight;
    int year;
    int month;
    int day;
    int hours;
    int minutes;
    LocalDateTime departureTime;
    LocalDateTime arrivalTime;
    // LocalDateTime duration;
    String aircraftBrand;
    float distance;

    Scanner scan = new Scanner(System.in);

    public void setDirection(String direction) {
        this.direction = this.direction;
    }

    public String getDirection() {
        return direction;
    }

    int NowYear = LocalDateTime.now().getYear();

    public void setNumberFlight(String numberFlight) {
        this.numberFlight = numberFlight;
    }

    public String getNumberFlight() {
        this.numberFlight = numberFlight;
        return numberFlight;
    }

    public void setYear(int year) {
        int trueYear = year;
        if (year > NowYear)
        {
            System.out.println("Ошибка! Некорректное значение года.");
            System.out.print("Введите год: ");
            trueYear = scan.nextInt();
        }
        else if (year < 0) {
            System.out.println("Ошибка! Некорректное значение года.");
            System.out.print("Введите год: ");
            trueYear = scan.nextInt();
        }

        this.year = trueYear;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day){
        int trueDay = day;
        if(trueDay <= 0 || trueDay > 31) {
            System.out.print("Ошибка! Некорректное значение. Попробуйте снова: ");
            trueDay = scan.nextInt();
        }

        this.day = trueDay;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month){
        int trueMonth = month;
        if(trueMonth <= 0 || trueMonth > 12) {
            System.out.print("Ошибка! Некорректное значение. Попробуйте снова: ");
            trueMonth = scan.nextInt();
        }

        this.month = trueMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setHours(int hours) {
        int trueHours = hours;
        if(trueHours <= 0 || trueHours > 23) {
            System.out.print("Ошибка! Некорректное значение. Попробуйте снова: ");
            trueHours = scan.nextInt();
        }
        this.hours = trueHours;
    }

    public int getHours() {
        return hours;
    }
    public void setMinutes(int minutes) {
        int trueMinutes = minutes;
        if(trueMinutes <= 0 || trueMinutes > 59) {
            System.out.print("Ошибка! Некорректное значение. Попробуйте снова: ");
            trueMinutes = scan.nextInt();
        }
        this.minutes = trueMinutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setAircraftBrand(String aircraftBrand) {
        this.aircraftBrand = aircraftBrand;
    }

    public String getAircraftBrand() {
        return aircraftBrand;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return (int) distance;
    }

    public void DepartureTime()
    {
        departureTime = LocalDateTime.of(year, month, day, hours, minutes);

    }

    public void ArrivalTime()
    {
        arrivalTime = LocalDateTime.of(year, month, day, hours, minutes);
    }
    public void OutputInfo() {
        System.out.println("\n");
        System.out.println("Номер авиарейса: " + numberFlight);
        System.out.println("Дата и время вылета: " + departureTime);
        System.out.println("Дата и время прилёта: " + arrivalTime);
        System.out.println("Марка самолёта: " + aircraftBrand);
        System.out.println("Расстояние: " + distance);
        System.out.println();
    }
}
