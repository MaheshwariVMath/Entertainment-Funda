package com.cg.service;

import com.cg.dao.CdDao;
import com.cg.dto.CD;

public class CDService {
	CdDao cdDao;

	public boolean addCD(CD cd) {
		cdDao = new CdDao();
		return cdDao.addCD(cd);
	}
}
