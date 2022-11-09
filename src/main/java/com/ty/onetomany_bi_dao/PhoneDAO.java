package com.ty.onetomany_bi_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;
import com.ty.onetomany_bi_dto.Phone;
import com.ty.onetomany_bi_dto.Sim;

public class PhoneDAO {
public void savePhone(Phone phone)
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	entityTransaction.begin();
	entityManager.persist(phone);
	List<Sim> list = phone.getSim();
	for(Sim sim:list)
	{
		entityManager.persist(sim);
	}
	entityTransaction.commit();
}
}
