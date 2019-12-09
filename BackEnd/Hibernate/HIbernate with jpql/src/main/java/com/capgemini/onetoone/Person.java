package com.capgemini.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="person")

public class Person {
	@Id
	@Column
		private int pid;
	@Column
		private String pname;

		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="voter_id")
		private Votercard Votercard;
	
	
		public Votercard getVotercard() {
			return Votercard;
		}
		public void setVotercard(Votercard votercard) {
			Votercard = votercard;
		}
		public int getPid() {
			return pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		
		
		
		
		
		
	

}
