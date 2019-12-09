package com.capgemini.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="votercard")
public class Votercard {
	@Id
	@Column
	private int voter_id;
	@Column
	private String vaddress;
	
	@OneToOne(mappedBy = "Votercard")
	private Person person;
	
	public String getVaddress() {
		return vaddress;
	}
	public Person getPerson() {
		return person;
	}
	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getVoter_id() {
		return voter_id;
	}
	public String getvaddress() {
		return vaddress;
	}
	public void setVoter_id(int vid) {
		this.voter_id = vid;
	}
	public void setvaddress(String vname) {
		this.vaddress = vname;
	}

	
	

}
