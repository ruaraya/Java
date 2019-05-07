package com.ruben.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruben.beans.Marca;
import com.ruben.dao.DAOMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca {

	@Autowired
	private DAOMarca daoMarca;
	
	@Override
	public void registrar(Marca marca) throws Exception {
		try {
			daoMarca.registrar(marca);
		} catch(Exception e) {
			throw e;
		}
		
	}

}
