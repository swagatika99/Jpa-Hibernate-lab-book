package com.cg.dao;

import com.cg.entity.AutEntity;

public interface AutDao {
	boolean saveAut(AutEntity aut);

	AutEntity getAut(int id);

	boolean update(AutEntity aut);

}
