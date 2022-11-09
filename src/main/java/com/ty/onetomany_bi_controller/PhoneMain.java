package com.ty.onetomany_bi_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomany_bi_dao.PhoneDAO;
import com.ty.onetomany_bi_dto.Phone;
import com.ty.onetomany_bi_dto.Sim;

public class PhoneMain {

	public static void main(String[] args) {

		
		Phone ph=new Phone();
		ph.setModel("M1pro");
		ph.setManufacturer("Samsung");
		
		Sim sim1=new Sim();
		sim1.setCompany("Airtel");
		sim1.setNetwork("4G");
		sim1.setPhone(ph);
		
		
		Sim sim2=new Sim();
		sim2.setCompany("Jio");
		sim2.setNetwork("5G");
		sim2.setPhone(ph);
		
		
		List<Sim> l=new ArrayList<Sim>();
		l.add(sim1);
		l.add(sim2);
		ph.setSim(l);
		
		PhoneDAO dao=new PhoneDAO();
		dao.savePhone(ph);
		
	}

}
