/*
Вариант №13 (Лисовой Владислав АТ-201)
Вывести данные об авиарейсе с максимальной
длительностью полёта.
*/

package com.onpy;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество авиарейсов: ");
        int inCountFlight = scan.nextInt();

        Flight[] flight = new Flight[inCountFlight];

        long hours = 0;
        long minutes = 0;
        long seconds = 0;
        for (int i = 0; i < flight.length; i++) {
            flight[i] = new Flight();
            scan.nextLine();
            System.out.print("Введите номер рейса: ");
            flight[i].setNumberFlight(scan.nextLine().trim());
            System.out.print("Введите дату и время вылета самолёта (Год/Месяц/День/Час/Минуты): ");
            flight[i].setYear(scan.nextInt());
            flight[i].setMonth(scan.nextInt());
            flight[i].setDay(scan.nextInt());
            flight[i].setHours(scan.nextInt());
            flight[i].setMinutes(scan.nextInt());
            flight[i].DepartureTime();
            System.out.print("Введите дату и время прилёта (Год/Месяц/День/Час/Минуты): ");
            flight[i].setYear(scan.nextInt());
            flight[i].setMonth(scan.nextInt());
            flight[i].setDay(scan.nextInt());
            flight[i].setHours(scan.nextInt());
            flight[i].setMinutes(scan.nextInt());
            flight[i].ArrivalTime();
            scan.nextLine();
            System.out.print("Введите марку самолёта: ");
            flight[i].setAircraftBrand(scan.nextLine());
            System.out.print("Введите расстояние: ");
            flight[i].setDistance(scan.nextInt());

            for (int j = 0; j < flight.length; j++) {
                Duration duration = Duration.between(flight[i].arrivalTime, flight[i].departureTime);
                seconds = Math.abs(duration.getSeconds());
                hours = seconds / 3600;
                seconds -= (hours * 3600);
                minutes = seconds / 60;
                seconds -= (minutes * 60);
                //flight[i].OutputInfo();
            }
        }
        System.out.print("\nАвиарейс с максимальной длительностью полёта: ");
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }
}