package com.gmt.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gmt.dao.PaisDAO;
import com.gmt.model.Pais;

@Repository("paisDAO")
public class PaisDaoImpl implements PaisDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	public void setJdbcTemplate(DataSource dataSource) {
//		this.jdbcTemplate = new JdbcTemplate(dataSource);
//	}

	@Override
	public List<Pais> listPais(){
		List<Pais> lista = new ArrayList<>();
		List<Map<String, Object>> resultado = jdbcTemplate.queryForList("SELECT * FROM COUNTRY WHERE Continent = ?", 
												new Object[]{"South America"});
		for (Map<String, Object> map : resultado) {
			System.out.println(map.toString());
			Pais pais = new Pais();
			pais.setCodigo((String)map.get("Code"));
			pais.setDescripcion((String)map.get("Name"));
			lista.add(pais);
		}
		
		return lista;
	}

}
