package com.gmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmt.dao.PaisDAO;
import com.gmt.model.Pais;
import com.gmt.service.PaisService;

@Service("paisService")
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisDAO paisDAO;
	
	@Override
	public List<Pais> listPais() {
		return paisDAO.listPais();
	}

}
