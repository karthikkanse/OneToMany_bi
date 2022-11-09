package com.ty.onetomany_bi_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String company;
private String network;
@ManyToOne
@JoinColumn
private Phone phone;
public Phone getPhone() {
	return phone;
}
public void setPhone(Phone phone) {
	this.phone = phone;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getNetwork() {
	return network;
}
public void setNetwork(String network) {
	this.network = network;
}
}
