package com.rentABootcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@SpringBootApplication
public class RentABootcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentABootcarApplication.class, args);
//		LocalDate startDate = LocalDate.of(2021,11,15);
//		LocalDate endDate = LocalDate.of(2021,11,20);
//		int days = (int) DAYS.between(startDate, endDate);
//		List<LocalDate> dates = startDate.datesUntil(endDate.plusDays(1)).collect(Collectors.toList());
//		System.out.println(dates);
//		System.out.println(days);
//		System.out.println(endDate.toString());
//		String date = "2021-11-25";
//		System.out.println(LocalDate.parse(date));

	}

}
