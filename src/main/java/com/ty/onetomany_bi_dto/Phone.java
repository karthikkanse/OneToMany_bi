package com.ty.onetomany_bi_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String model;
private String manufacturer;
@OneToMany(mappedBy = "phone")
private List<Sim> sim;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public List<Sim> getSim() {
	return sim;
}
public void setSim(List<Sim> sim) {
	this.sim = sim;
}


}
