package com.capgemini.jpawithhibernate.dto;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String mname;
	@Column
	private String rating;

	public int getId() {
		return id;
	}

	public String getName() {
		return mname;
	}

	public String getRating() {
		return rating;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.mname = name;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
