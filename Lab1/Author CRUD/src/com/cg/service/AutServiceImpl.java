package com.cg.service;

import com.cg.dao.AutDao;
import com.cg.dao.AutDaoImpl;
import com.cg.entity.AutEntity;

public class AutServiceImpl implements AutService{
AutDao adao;

	public AutServiceImpl() {
	adao=new AutDaoImpl();
}

	@Override
	public boolean saveAut(AutEntity aut) {
		return adao.saveAut(aut);
	}

	@Override
	public AutEntity getAut(int id) {
		return adao.getAut(id);
	}

	@Override
	public boolean update(AutEntity aut) {

		return adao.update(aut);
	}

}
