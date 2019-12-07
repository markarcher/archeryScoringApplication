package com.archeryScoringApp.mark.domain;

import java.util.Date;

public class Tournament {

	private String name;
	private String venue;
	private Date date;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Tournament() {
	
	}

}
