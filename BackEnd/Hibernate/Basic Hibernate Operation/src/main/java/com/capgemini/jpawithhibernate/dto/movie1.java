package com.capgemini.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="movie1")
public class movie1 {
	@Id
	@Column
	private int Movie_ID;
	@Column
	private String Movie_Name;
	@Column
	private String  Movie_Rating;
	
	public int getMovie_ID() {
		return Movie_ID;
	}
	public String getMovie_Name() {
		return Movie_Name;
	}
	public String getMovie_Rating() {
		return Movie_Rating;
	}
	public void setMovie_ID(int movie_ID) {
		Movie_ID = movie_ID;
	}
	public void setMovie_Name(String movie_Name) {
		Movie_Name = movie_Name;
	}
	public void setMovie_Rating(String movie_Rating) {
		Movie_Rating = movie_Rating;
	}
	
	
}

