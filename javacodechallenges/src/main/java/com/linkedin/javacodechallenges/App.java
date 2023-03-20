package com.linkedin.javacodechallenges;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.crypto.spec.GCMParameterSpec;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now

    public static void main( String[] args )

    {

        LocalDate today = LocalDate.now();
        System.out.println("100 days from now is... " +
             gDate(today));
    }

    public static LocalDate gDate(LocalDate today) {
         Period hundredDays = Period.ofDays(100);
         return today.plus(hundredDays);
    }
    
}
