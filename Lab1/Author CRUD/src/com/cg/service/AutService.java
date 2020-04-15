package com.cg.service;

import com.cg.entity.AutEntity;

public interface AutService {
	boolean saveAut(AutEntity aut);

	AutEntity getAut(int nextInt);

	boolean update(AutEntity aut);
	

}

