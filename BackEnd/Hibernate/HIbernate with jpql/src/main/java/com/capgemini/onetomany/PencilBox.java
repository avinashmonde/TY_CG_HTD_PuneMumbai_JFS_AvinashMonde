package com.capgemini.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pencilbox")
public class PencilBox {
@Id
@Column
private int box_id;
@Column
private String name;

@OneToMany(mappedBy = "pencilbox")
private List<Pencil> pencil;

public List<Pencil> getPencil() {
	return pencil;
}
public void setPencil(List<Pencil> pencil) {
	this.pencil = pencil;
}
public int getBox_id() {
	return box_id;
}
public String getName() {
	return name;
}
public void setBox_id(int box_id) {
	this.box_id = box_id;
}
public void setName(String name) {
	this.name = name;
}



}
