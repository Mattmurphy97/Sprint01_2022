package com.keyin.sprint;

import java.util.GregorianCalendar;

public class TourneyTest {

    public static void main(String[] args){
        GregorianCalendar start = new GregorianCalendar(2023,6,20);
        System.out.println(start.getTime());
        GregorianCalendar end = new GregorianCalendar(2023, 6, 24);
        System.out.println(end.getTime());
        Tourney tour1 = new Tourney( start, end, 50.0, 1000.0);
        System.out.println(tour1.getEntryFee());
        tour1.setEntryFee(100);
        System.out.println(tour1.getEntryFee());
        tour1.setEntryFee(40);
        System.out.println(tour1.getEntryFee());



    }
}
