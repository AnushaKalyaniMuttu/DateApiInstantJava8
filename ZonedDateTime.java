package com.order;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTime {

	public static void main (String [] args) {
	Instant instant=Instant.now();
	System.out.println(instant);
	System.out.println(instant.getEpochSecond());
	System.out.println("*****************************");
	
	ZonedDateTime zoneDateTime=ZonedDateTime.now();
	System.out.println(zoneDateTime);
	System.out.println(zoneDateTime.getOffset());
	System.out.println(zoneDateTime.getZone());
	System.out.println(ZoneId.getAvailableZoneIds().size());


	}
}
