package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.entity.AutEntity;
import com.cg.util.Jpautil;

public class AutDaoImpl implements AutDao {

	@Override
	public boolean saveAut(AutEntity aut) {
		boolean saved = false;
		try{
		EntityManager em = Jpautil.getEntityManager();
		em.getTransaction().begin();
		em.persist(aut);
		em.getTransaction().commit();
		saved = true;
		}
		catch(Exception e){			
		}
		return saved;
	}

	@Override
	public AutEntity getAut(int id) {

		AutEntity emp = null;
		try{
			EntityManager em = Jpautil.getEntityManager();
			emp = em.find(AutEntity.class, id);
		}
		catch(Exception e){			
		}
		return emp;
	}


	@Override
	public boolean update(AutEntity aut) {

		boolean updated=false;
		try{
			EntityManager em = Jpautil.getEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.merge(aut);
			et.commit();
			updated = true;
		}
		catch(Exception e){
		}
		return updated;
	}

}
